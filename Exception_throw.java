import java.util.Scanner;

public class Exception_throw {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your age : ");
        int age = sc.nextInt();

        try{
            if(age < 18)
                // throw new ArithmeticException("Under aged User"); 
                throw new IllegalArgumentException("Under aged User"); // Much better
            else
                System.out.println("Access granted");
        }catch(Exception e){System.out.println(e);}
    }
}
