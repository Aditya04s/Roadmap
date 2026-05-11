public class Throw_s {
    static void checkMarks(int marks) throws Exception // Why is throws imp here?
    {
        if(marks < 35)
            throw new Exception("Falied");
        else
            System.out.println("Passed");
    }
    // public static void main(String[] args) throws Exception{ 
    // 'throws is used to replaced try-catch'
    public static void main(String[] args){

        int marks = 33;

        try{
            checkMarks(marks);
        }catch(Exception e) {System.out.println(e);}
    }
}
