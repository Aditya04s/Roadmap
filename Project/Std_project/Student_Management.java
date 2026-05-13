import java.io.*;
import java.util.*;
// import java.io.BufferedReader;
// import java.io.FileReader;
// import java.io.FileWriter;
// import java.util.ArrayList;
// import java.util.Scanner;

public class Student_Management {

    static Scanner sc = new Scanner(System.in);
    static ArrayList<Student> std = new ArrayList<>();

    static void addStudent() {

        System.out.println("Enter Student ID : ");
        int std_id = sc.nextInt();
        sc.nextLine(); // clear leftover newline
        System.out.println("Enter Student name : ");
        String std_name = sc.nextLine();
        System.out.println("Enter Student marks : ");
        double std_marks = sc.nextDouble();

        std.add(new Student(std_id, std_name, std_marks));

    }

    static void displayStudents() {
        // std.display(); // not possible
        for (Student x : std) {
            // System.out.println("Student ID : " + x.getId());
            // System.out.println("Student name : " + x.getName());
            // System.out.println("Marks : " + x.getMarks());
            x.display();
            System.out.println("-------------------------------------");
        }
    }

    static void searchStudent() {

        System.out.println("Enter Student ID to search : ");
        int searchId = sc.nextInt();
        boolean found = false;
        for (Student x : std) {
            if (x.getId() == searchId) {
                x.display();
                found = true;
                break;
            }
        }
        if (found == false)
            System.out.println("not found");
        else
            System.out.println("\nStudent ID found");
    }

    static void deleteStudent() {
        System.out.println("Enter student ID to delete : ");
        int delId = sc.nextInt();

        boolean found1 = false;
        Student temp = null;

        for (Student x : std) {
            if (x.getId() == delId) {
                temp = x;
                found1 = true;
                break;
            }
        }
        if (found1 == false) {
            System.out.println("ID not found");
        } else {
            std.remove(temp);
            System.out.println("Deleted record");
        }
    }

    static void saveFile() {
        try {
            FileWriter fw = new FileWriter("students.txt");

            for (Student x : std) {
                // fw.write(x.getId() + ", ");
                // fw.write(x.getName() + ", ");
                // fw.write(x.getMarks() + "\n");
                fw.write(
                        x.getId() + ", " +
                                x.getName() + ", " +
                                x.getMarks() + "\n");
            }
            fw.close();
            System.out.println("File created successfully.");

        } catch (Exception e) {
            System.out.println(e);
        }
        // finally{System.out.println("File created successfully.");} // Logically not
        // correct, if file not created then also it prints
    }

    static void loadExistingData() {
        try {

            BufferedReader br = new BufferedReader(
                    // Filereader fr = new FileReader("students.txt")
                    new FileReader("students.txt"));

            String line;
            while ((line = br.readLine()) != null) // Use double ()
            {
                // 101, Ritik, 76.54
                // Now store these individually, but not as a string
                String parts[] = line.split(",");

                // for(String i : parts){
                // System.out.println(i);
                // } // need index value so not using adv. for loop

                // for(int i=0 ; i< parts.length ; i++){ // Loop not required, 'cause loading
                // each data 3 times

                // here each line has 3 variables, and it gets reset everytime in for loop by
                // while loop
                int id = Integer.parseInt(parts[0].trim());
                String name = parts[1].trim();
                double marks = Double.parseDouble(parts[2].trim());

                Student s = new Student(id, name, marks);

                std.add(s);
                // }

            }
            System.out.println("File successfully loaded");
            br.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {

        while (true) {
            System.out.println("\n-------Student management menu-------");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search Student");
            System.out.println("4. Delete record");
            System.out.println("5. Save/Create as file");
            System.out.println("6. Load existing data");
            System.out.println("7. Exit");

            System.out.println("\nEnter your choice : ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    displayStudents();
                    break;
                case 3:
                    searchStudent();
                    break;
                case 4:
                    deleteStudent();
                    break;
                case 5:
                    saveFile();
                    break;
                case 6:
                    loadExistingData();
                    break;
                case 7:
                    System.out.println("Exiting...");
                    sc.close();
                    System.exit(0);
                    // break;
                default:
                    System.out.println("invalid choice!");
                    break;
            } // switch
        } // while
          // sc.close(); // Why is this throwing error
          // 'cause of infinity loop [while(true)] and exit(0)
    }
}