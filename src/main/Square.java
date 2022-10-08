package main;

public class Square extends Shape{
    @Override
    public int calculateArea() {
        return 4;
    }

    @Override
    public void print(int number) {
        System.out.println("hello square");
    }
}
