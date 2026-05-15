import java.util.ArrayList;

class Product{
    int id;
    String name;
    double price;

    Product(int id, String name, double price){
        this.id = id;
        this.name = name;
        this.price = price;
    }
}

public class Object_ArrayLists {
    public static void main(String[] main){

        Product p1 = new Product(111,"Orange",234.4);
        Product p2 = new Product(112,"Firebold watch",654.56);
        Product p3 = new Product(115,"Wood",49.64);

        // p1.id = 111;
        // p1.name = "Orange";
        // p1.price = 234.3;

        // p2.id = 112;
        // p2.name = "Firebold watch";
        // p2.price = 549.32;

        // p3.id = 115;
        // p3.name = "Wood";
        // p3.price = 49.3;

        ArrayList<Product> lists = new ArrayList<>();

        lists.add(p1);
        lists.add(p2);
        lists.add(p3);

        for(Product X : lists){ 
            System.out.println("ID : " + X.id);
            System.out.println("Name : " + X.name);
            // if(X.price > 100)
            System.out.println("Price : " + X.price);
            System.out.println("-----------------------------");
        }
    }
}
