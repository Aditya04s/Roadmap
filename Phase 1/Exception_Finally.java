import java.util.Scanner;

public class Exception_Finally {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter 1st number : ");
        int a = sc.nextInt();
        System.out.println("Enter 2nd number : ");
        int b = sc.nextInt();

        try{
            int c = a/b;
            System.out.println("After dividing : " + c);
        }catch(ArithmeticException e){
            System.out.println("Cannot divide by zero");
        }finally{
            System.out.println("Program ended");
        }
    }
}
