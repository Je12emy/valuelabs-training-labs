package lab_6;

public class Outer {
    public void display(){
        System.out.println("Display outer class");
    }
    
    public static class Inner {
        public static void display(){
            System.out.println("Display inner static class");
        }
    }    
}
