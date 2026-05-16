import java.util.Stack;

public class Stack_brackets {
    public static void main(String[] args){

        Stack<Character> st = new Stack<>();
        // String var = "{[()]}";
        String var = "([[]]){}";

        for(int i=0 ; i<var.length() ; i++)
        {
            char ch = var.charAt(i);
            if(ch == '{' || ch ==  '[' || ch == '('){
                st.push(ch);
            }
            else if(ch == '}' || ch ==  ']' || ch == ')'){
                char ch_rev;
                if(st.isEmpty()){
                    System.out.println("Invalid Expression");
                    break;
                }
                
                ch_rev = st.pop();

                if(ch_rev == '(' && ch == ')')
                    System.out.println();
                else if(ch_rev == '[' && ch == ']')
                    System.out.println();
                else if(ch_rev == '{' && ch == '}')
                    System.out.println();
                else{
                    System.out.println("Invalid Expression");                
                    break;
                }
            }
        }
        System.out.println("Valid Expression");
        // System.out.println((int)'{');
        // System.out.println((int)'}');
        // System.out.println((char)124);
    }
}