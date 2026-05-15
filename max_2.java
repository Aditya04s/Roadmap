public class max_2 {
    public static void main(String[] args) {
        int arr[] = { 12, 45, 23, 67, 67, 34 };
        // int arr[] = { 67, 67, 45 };
        // int arr[] = { 67, 67, 12, 45, 23, 55 };

        int max_1 = arr[0];
        int max_2 = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max_1 ) {
                max_2 = max_1;
                max_1 = arr[i];
            }
            // if (arr[i] < max_1 && arr[i] > max_2) {
            else if (arr[i] > max_2 && arr[i] != max_1) {
                max_2 = arr[i];
            }
            // if(max_1 == max_2 && arr[i] < max_2) // This is a patch code, you could have avoided it
            //     max_2 = arr[i];
        }

        System.out.println("1st largest no : " + max_1);
        System.out.println("2nd largest no : " + max_2);

    }
}