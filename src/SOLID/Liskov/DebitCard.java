package SOLID.Liskov;

public class DebitCard extends Payment{

    @Override
    public void pay(int amount) {
        System.out.println("paying through debit card");
    }

    @Override
    public void refund() {
       System.out.println("refunding to debit card");
    }
}
