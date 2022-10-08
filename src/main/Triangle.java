package main;

public class Triangle extends Shape{
    @Override
    public int calculateArea() {
        return 3;
    }

    @Override
    public void print() {
        System.out.println("hello triangle");
    }
}
