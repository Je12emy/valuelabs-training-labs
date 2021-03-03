package lab_5;

public class Circle extends Shape{
    @Override
    public void draw(){
        System.out.println("Draw circle");
    }

    public void draw(int radius){
        System.out.println("Draw with a radius of " + radius);
    }

    @Override
    public void erase(){
        System.out.println("Erase circle");
    }
}
