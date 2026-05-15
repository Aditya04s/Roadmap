/*
First create a array list element 
initialize max with the 1st element of array
then loop from the 2nd index and update the max under a if statement
print the result
*/
import java.util.ArrayList;

public class maximum_number_in_ArrayList {
    public static void main(String[] args){

        ArrayList<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(23);
        list.add(34);
        list.add(45);
        list.add(56);

        int max = list.get(0);

        for(int i=1 ; i<list.size() ; i++){
            int value = list.get(i);

            if(value > max)
                max = value;
        }

        System.out.print("The max element : " + max);
    }
}
