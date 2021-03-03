package other;

public class CostaRica {
    // These need to be static variables if they are not accessed through a object
    int a, b;

    // If we create the constructor, JVM will not create a default empty constructor
    public CostaRica(int a, int b){
        this.a = a;
        this.b = b;
    }

    public static void main(String[] args) {

        CostaRica cr = new CostaRica(1,2);

        System.out.println("Costa Rica" +cr.a);
    }
}
