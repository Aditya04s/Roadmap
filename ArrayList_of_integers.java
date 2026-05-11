import java.util.ArrayList;

public class ArrayList_of_integers{
    public static void main(String[] args){
        
        ArrayList<Integer> list = new ArrayList<>();
        int sum=0;

        list.add(34);
        list.add(12);
        list.add(54);
        list.add(49);
        list.add(23);

        for(int i=0 ; i<list.size() ; i++){
            int value = list.get(i);
            System.out.println(value); // avoid repeated use of get(i)
            sum += value;

            // System.out.println(list.get(i));
            // sum += list.get(i);
        }

        System.out.println("The sum is " + sum);
    }
}

// Forgot to use sum