package SOLID.Liskov;

public class CreditCard extends Payment{
    @Override
    public void pay(int amount) {
        System.out.println("paying through credit card");
    }

    @Override
    public void refund() {
      System.out.println("refunding to credit card");
    }
}
