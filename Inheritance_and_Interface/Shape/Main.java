package Inheritance_and_Interface.Shape;

public class Main {

    public static void main(String[] args) {
        Shape square = new Square(8,8,0,8,0,0,8,0);

        System.out.println(square.getArea());
        System.out.println(square.getPerimeter());
    }

}
