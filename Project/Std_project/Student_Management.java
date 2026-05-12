import java.util.*;
// import java.util.ArrayList;
// import java.util.Scanner;

public class Student_Management {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Student> std = new ArrayList<>();

        while (true) {
            System.out.println("\n-------Student management menu-------");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Delete record");
            System.out.println("5. Exit");

            System.out.println("\nEnter your choice : ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter Student ID : ");
                    int std_id = sc.nextInt();
                    sc.nextLine(); // clear leftover newline
                    System.out.println("Enter Student name : ");
                    String std_name = sc.nextLine();
                    System.out.println("Enter Student marks : ");
                    double std_marks = sc.nextDouble();

                    std.add(new Student(std_id, std_name, std_marks));

                    break;

                case 2:
                    // std.display(); // not possible
                    for (Student x : std) {
                        // System.out.println("Student ID : " + x.getId());
                        // System.out.println("Student name : " + x.getName());
                        // System.out.println("Marks : " + x.getMarks());
                        x.display();
                        System.out.println("-------------------------------------");
                    }

                    break;

                case 3:
                    System.out.println("Enter Student ID to search : ");
                    int searchId = sc.nextInt();
                    boolean found = false;
                    for(Student x : std){
                        if(x.getId() == searchId){
                            x.display();
                            found = true;
                            break;
                        }
                    }
                    if(found == false)
                        System.out.println("not found");

                    break;
                
                case 4:
                    System.out.println("Enter student ID to delete : ");    
                    int delId = sc.nextInt();
                    boolean rem = false;
                    Student temp = null;
                    for(Student x : std){
                        if(x.getId() == delId){
                            temp = x;
                            rem = true;
                        }
                    }
                    std.remove(temp);
                    if(rem == false){
                        System.out.println("ID not found");
                    }else{
                        System.out.println("Deleted record");
                    }

                    break;

                case 5:
                    System.exit(0);
 
                default:
                    System.out.println("invalid choice!");
                    break;
            }
        }
    }
}