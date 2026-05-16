public class consecutive_freq {
    public static void main(String[] args) {
        // String var = "aabbbbccdd";
        String var = "aaaabbeeeeeekkkkkkkk";
        int count = 1, prev_count = 0;
        char max = 0;

        for (int i = 0; i < var.length() - 1; i++) {
            // System.out.println(count + " " + max);
            if (var.charAt(i) == var.charAt(i + 1)) {
                count++;
                if (count > prev_count) {
                    prev_count = count;
                    max = var.charAt(i);
                }
                // prev_count = count;
                // max = var.charAt(i);
            } else {
                count = 1;
            }
            // System.out.println(count);
        }
        System.out.println("The consecutive char is " + max + " with count "+ prev_count);
    }
}