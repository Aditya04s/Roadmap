/*
Focus more on false statements rather than handeling true statements
*/

public class Pointers_palindrome {
    public static void main(String[] args) {

        // String s = "asdfhjfdsa";
        String s = "asdflpfdsa";
        int left = 0;
        int right = s.length() - 1;
        boolean valid = true;
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(left) != s.charAt(right)) {
                valid = false;
                break;
            } 
            // else {
            //     valid = false;
            //     break;
            //     // System.exit(0); // avoid using
            // }
            left++;
            right--;
        }
        if (valid == false)
            System.out.println(s + " - Not a palindrome");
        else
            System.out.println(s + " - Palindrome");
    }
}