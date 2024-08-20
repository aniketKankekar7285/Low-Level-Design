package FactoryPattern;

public class mainClass {
    public static void main(String args[]){
        System.out.println("Factory Pattern");
        ShapeFactory shapeFactory=new ShapeFactory();
        Shape circularShape=shapeFactory.getShape("Circle");
        circularShape.draw();
        Shape squareShape=shapeFactory.getShape("Square");
        squareShape.draw();
    }
}
