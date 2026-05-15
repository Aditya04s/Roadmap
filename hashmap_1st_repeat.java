/*
Find First Repeating Element

Input:

[4, 7, 1, 4, 9, 7]

Output:

4

Because:

4 is the first element that repeats
*/
import java.util.HashMap;

public class hashmap_1st_repeat {
    public static void main(String[] args){
        
        // int a[] = {4, 7, 1, 4, 9, 7};
        int a[] = {7, 4, 4, 7};
        HashMap<Integer, Integer> map = new HashMap<>();

        int x=0;
        for(int i=0 ; i<a.length ; i++){
            if(map.containsKey(a[i])){
                int val = map.get(a[i]);
                map.put(a[i], val+1);
                x = a[i];
                // break;
            }else{
                map.put(a[i],1);
            }
        }
        System.out.println("Key : " + x);
    }
}

/*
if object does not exist then create one

Hashmap should store the number which is repeated first before others in the array

so stop as soon as a value is updated
*/