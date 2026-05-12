public class student
{
    private int id;
    private String name;
    private double marks;
    
    student(int id, String name, double marks){
        this.id = id;
        this.name = name;
        this.marks = marks;
    }    

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public double getMarks(){
        return marks;
    }

    void display(){
        System.out.println("Student ID : " + id);
        System.out.println("Student name : " + name);
        System.out.println("Marks : " + marks);
    }
}    
