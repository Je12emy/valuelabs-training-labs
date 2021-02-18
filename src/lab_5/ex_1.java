package lab_5;

public class ex_1 {
    public static void main(String[] args) {
        /*
        5.1 Write a program to create a class named shape. In this class we have three sub classes circle,
        triangle and square each class has two member function named draw () and erase ().
         Create these using polymorphism concepts.
         */

        Shape shape = new Shape();
        shape.draw();

        Triangle triangle = new Triangle();
        triangle.draw("Isosceles");

        Circle circle = new Circle();
        circle.draw();
        circle.draw(5);

        Square square = new Square();
        square.draw();
        square.erase();
    }
}
