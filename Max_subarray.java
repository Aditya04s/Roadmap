// not optimised version

public class Max_subarray {
    public static void main(String[] args) {

        // int a[] = { 2, 1, 5, 1, 3, 2 };
        int a[] = { 2, 1, 4,1,3,2,1,5, 1, 3, 2 };
        int sum = 0, max = 0, k = 3;
        int i;

        for (i = 0; i <= a.length-k; i++) {  // use <= to include the last set
            sum = 0;
            for (int j = i; j < k+i; j++) {
                sum += a[j];
                // System.out.print(j + " "); // just for debugging 
            }
            // System.out.println(); 
            System.out.println(sum + " : subset : " + i);
            if (sum > max) {
                max = sum;
            }
            // else if(i == a.length - k){  //do not use this
            //     break; // although this works it is a repair logic
            // }
        }

        System.out.println("The max sum is " + max);
    }
}
