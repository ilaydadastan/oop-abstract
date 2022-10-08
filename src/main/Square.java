package main;

public class Square extends Shape{
    @Override
    public int calculateArea() {
        return 4;
    }

    @Override
    public void print() {
        System.out.println("hello square");
    }
}
