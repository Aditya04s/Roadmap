import java.io.FileReader;

// Program looks complicated just because I wanted to use finally block, uff
public class Files_read {
    public static void main(String[] args) {
        
        FileReader fr = null;

        try {
            fr = new FileReader("F_student.txt");

            int ch;

            while ((ch = fr.read()) != -1) // Use double breackets ()
            {
                System.out.print((char) ch); // Avoid println
            }

            fr.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        finally{
        // fr.close(); // Why can't I do this ? 'cause another error will occure
           try{
                if(fr != null){
                    fr.close();
                }
            }
            catch(Exception e){
                System.out.println(e);
            }

            System.out.println("\nReading completed");
        }
    }
}