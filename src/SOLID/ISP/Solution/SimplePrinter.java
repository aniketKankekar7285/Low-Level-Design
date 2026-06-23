package SOLID.ISP.Solution;

public class SimplePrinter implements PrintableMachine{
    @Override
    public void print() {
        System.out.println("Printing data");
    }
}
