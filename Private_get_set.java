//Learn about encapsulation here
import java.util.ArrayList;

class Product1{
    private int id;
    private String name;
    private double price;

    Product1(int id, String name, double price){
        this.id = id;
        this.name = name;
        this.price = price;
    }

    int idGet(){
        return this.id; // this. not compulsory
    }
    String nameGet(){
        return name;
    }
    double priceGet(){
        return price;
    }
    void priceSet(double price){
        if(price > 0)
            this.price = price;
    }
}

public class Private_get_set {
    public static void main(String[] main){

        Product1 p1 = new Product1(111,"Orange",234.4);
        Product1 p2 = new Product1(112,"Firebold watch",654.56);
        Product1 p3 = new Product1(115,"Wood",49.64);

        ArrayList<Product1> lists = new ArrayList<>();

        lists.add(p1);
        lists.add(p2);
        lists.add(p3);

        for(Product1 X : lists){ 
            // System.out.println("ID : " + X.id);  // This is invalid, throws error
            System.out.println("ID : " + X.idGet());  
            System.out.println("Name : " + X.nameGet());
            System.out.println("Price : " + X.priceGet());
            System.out.println("-----------------------------");
        }
    }
}
