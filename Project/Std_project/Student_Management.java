import java.util.*;
// import java.util.ArrayList;
// import java.util.Scanner;

public class Student_Management {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<student> std = new ArrayList<>();

        while (true) {
            System.out.println("-------Student management menu-------");
            System.out.println("1. Add student");
            System.out.println("2. View students");
            System.out.println("3. Exit");

            System.out.println("\nEnter your choice : ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter student ID : ");
                    int std_id = sc.nextInt();
                    sc.nextLine(); // clear leftover newline
                    System.out.println("Enter student name : ");
                    String std_name = sc.nextLine();
                    System.out.println("Enter student marks : ");
                    double std_marks = sc.nextDouble();

                    std.add(new student(std_id, std_name, std_marks));
                    break;

                case 2:
                    // std.display(); // not possible
                    for (student x : std) {
                        System.out.println("Student ID : " + x.getId());
                        System.out.println("Student name : " + x.getName());
                        System.out.println("Marks : " + x.getMarks());
                        System.out.println("-------------------------------------");
                    }
                    break;

                case 3:
                    System.exit(0);
                default:
                    System.out.println("invalid choice!");
            }
        }

    }
}