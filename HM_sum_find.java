
import java.util.HashMap;

/*
[2,7,11,15]
target = 9
*/

public class HM_sum_find{
    public static void main(String[] args){
        
        HashMap<Integer, Integer> map = new HashMap<>();
        // int a[] = {2,7,11,15};
        int a[] = {7,9,11,15,2};
        int target = 9;

        for(int i=0 ; i<a.length ; i++){
            int com = target-a[i];
            if(map.containsKey(com)){
                // int val = map.get(com);
                // com = target - val;
                System.out.println(com + " + " + a[i] + " = " + (com+a[i]));
            }else{
                map.put(a[i], i);
            }
        }
    }
}