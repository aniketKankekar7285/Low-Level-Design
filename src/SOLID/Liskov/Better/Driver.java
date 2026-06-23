package SOLID.Liskov.Better;

public class Driver {
    public static void main(String args[]){
        Payment p=new CreditCard();
        p.pay(2000);

        Refundable r=new CreditCard();
        r.refund(500);

        Payment p1 = new Cash();
        p1.pay(1000);
        //not allowed
        //p.refund();

    }
}
