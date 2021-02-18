package lab_5;

public class Square extends Shape {
    @Override
    public void draw() {
        super.draw();
        System.out.println("Square");
    }

    @Override
    public void erase() {
        super.erase();
        System.out.println("Square");
    }
}
