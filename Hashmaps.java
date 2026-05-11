import java.util.HashMap;

public class Hashmaps{
    public static void main(String []Args){

        HashMap<Integer, String> map = new HashMap<>();
        
        map.put(101,"Ritik");
        map.put(102,"Aman");
        map.put(103,"Neha");

        // for(int i=0 ; i<3 ; i++){        // No key value 0-3 only starts from 101-103
        //     String name = map.get(i);
        //     System.out.println(name);
        // }

        for(Integer key : map.keySet()){
            System.out.println(key + " : " + map.get(key));
        }

        System.out.println(map.get(102));

        if(map.containsKey(104)){
            System.out.println("Yes, 104 exists");
        }else{
            System.out.println("No 104");
        }

    }
}