package SOLID.Liskov.Better;

public class CreditCard implements Payment,Refundable{
    @Override
    public void pay(int amount) {

    }

    @Override
    public void refund(int amount) {

    }
}
