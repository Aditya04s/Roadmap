import java.util.Scanner;

public class Exception_array_bounce {
    public static void main(String[] args){
    
        int a[] = {10,20,30};
        Scanner sc = new Scanner(System.in);

        try{
            System.out.println("Enter index value : ");
            int x = sc.nextInt();
            System.out.println(a[x]);
        }catch(ArrayIndexOutOfBoundsException e){ System.out.println(e);}
    }
}
