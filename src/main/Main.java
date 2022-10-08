package main;

public class Main {
    public static void main(String[] args) {
        Shape shape1 = new Square();
        Shape shape2 = new Triangle();

        System.out.println(shape1.calculateArea());
        System.out.println(shape2.calculateArea());
        shape1.print(2);
        shape2.print(3);
    }
}
