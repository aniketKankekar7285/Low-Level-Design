package SOLID.Liskov;

public class Cash extends Payment{
    @Override
    public void pay(int amount) {
        System.out.println("paying through cash");
    }

    @Override
    public void refund() {
       throw new RuntimeException("cash refund not allowed");
    }
}
