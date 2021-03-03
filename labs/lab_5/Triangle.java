package lab_5;

public class Triangle extends Shape {
    @Override
    public void draw() {
        super.draw();
    }

    public void draw(String type) {
        System.out.print("Draw triangle of type " + type);
    }


    @Override
    public void erase() {
        super.erase();
    }
}
