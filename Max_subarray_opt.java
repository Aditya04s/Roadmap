// Optimized version

public class Max_subarray_opt {
    public static void main(String[] args) {
        // int a[] = { 2, 1, 5, 1, 3, 2 };
        int a[] = { 22, 1, 4, 1, 3, 2, 1, 5, 1, 3, 2 };
        int sum = 0, n_sum = 0;
        int k = 3, i;
        int max = 0;

        sum = a[0] + a[1] + a[2];
        max = sum;
        for (i = 0; i < a.length - k; i++) {
            n_sum = sum - a[i] + a[i + k];
            if (n_sum > max) {
                max = n_sum;
            }
            sum = n_sum;
        }
        System.out.println("The max sum is " + max);
    }
}