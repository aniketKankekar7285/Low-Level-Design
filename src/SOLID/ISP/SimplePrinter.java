package SOLID.ISP;

public class SimplePrinter implements Machine {

    @Override
    public void print() {
        System.out.println("printing sample data");
    }

    @Override
    public void fax() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void mail() {
        throw new UnsupportedOperationException();
    }
}
