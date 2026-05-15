class Vehicle
{
    String brand;
    double speed;
}
class car extends Vehicle
{
    String fuelType;

    void display()
    {
        System.out.println(brand);
        System.out.println(speed);
        System.out.println(fuelType);
    }
}

public class Inheretance_car {
    public static void main(String[] args){

        car x = new car();

        x.brand = "Suzuki";
        x.speed = 34.6;
        x.fuelType = "Petrol";

        x.display();
    }
}
