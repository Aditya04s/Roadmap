abstract class Shape
{
    abstract void area();
}
class Rectangle extends Shape
{
    void area()
    {
        System.out.println("L x B");
    }
}
class Circle extends Shape
{
    void area()
    {
        System.out.println("Pie * r * r");
    }
}

public class Abstract_shape{
    public static void main(String[] args){

        Shape cir = new Circle();
        Shape rec = new Rectangle();

        cir.area();
        rec.area();
    }
}