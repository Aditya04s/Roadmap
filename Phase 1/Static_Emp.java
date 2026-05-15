class Employee
{
    static String coName = "SNT";
    String empName;
    double salary;

    public Employee(String empName, double salary) {
        this.empName = empName;
        this.salary = salary;
    }

    public void display()
    {
        System.out.println("Company Name : " + coName);
        System.out.println("Employee name : " + empName);
        System.out.println("Salary : " + salary);
        System.out.println("---------------------------------------");
    }
}

public class Static_Emp {
    public static void main(String[] args){

        Employee E[] = {
            new Employee("Saha", 9595.4),
            new Employee("Akash", 5555.4),
            new Employee("Lohit",79696.4)
        };

        Employee.coName = "Infosys";  // co. name changed for all 

        for(Employee x : E){
            // System.out.println(x.display()); // This is wrong, you don't need to print.. just call
            x.display();
        }

    }
}
