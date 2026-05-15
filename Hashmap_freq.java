import java.util.HashMap;

public class Hashmap_freq {
    public static void main(String[] args){

        int a[] = {1, 2, 1, 3, 2, 1};

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0 ; i<a.length ; i++){
            if(map.containsKey(a[i])){
                int val = map.get(a[i]);
                map.put(a[i], val+1);
            }else{
                map.put(a[i], 1);
            }
        }

        for(int key : map.keySet()){
            System.out.println(key + " -> " + map.get(key));
        }        
    }
}

/*
There are 2 cases:

case 1 : If the key already exits then update the value by 1

case 2 : If the key does not exit then create one.
*/