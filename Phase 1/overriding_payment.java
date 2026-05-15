class Payments
{
    void makePayment()
    {
        System.out.println("Generic Payment");
    }
}
class UPI extends Payments
{
    void makePayment()
    {
        System.out.println("UPI payment successful");
    }
}
class Card extends Payments
{
    void makePayment()
    {
        System.out.println("Card payment successful");
    }
}

public class overriding_payment {
    public static void main(String[] args){

        Payments p1 = new UPI();
        Payments p2 = new Card();

        p1.makePayment();
        p2.makePayment();
    }
}
