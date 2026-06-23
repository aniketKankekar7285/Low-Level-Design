package SOLID.ISP.Solution;

public class AdvancedPrinter implements PrintableMachine,FaxMachine{
    @Override
    public void fax() {
        System.out.println("Sending Fax");
    }

    @Override
    public void print() {
        System.out.println("printing sample data");
    }
}
