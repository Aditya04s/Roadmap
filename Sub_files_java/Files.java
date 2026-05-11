import java.io.FileWriter;

public class Files {
        // public static void main(String[] args) throws IOException {
    public static void main(String[] args)throws Exception{
        try {
            FileWriter fw = new FileWriter("F_student.txt");

            fw.write("Name: Ritik \nCourse: BCA");

            fw.close();
            System.out.println("File completed");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
