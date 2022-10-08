package main;

public class Triangle extends Shape{
    @Override
    public int calculateArea() {
        return 3;
    }

    @Override
    public void print(int number) {
        System.out.println("hello triangle");
    }
}
