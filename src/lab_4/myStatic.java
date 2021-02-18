package lab_4;

public class myStatic {
    static {
        System.out.println("Static class has been created");
    }

    public static String name;

    public static void salute() {
        /*
        4.1 Write a program to demonstrate static variables, methods, and blocks. x
         */
        System.out.println("Hello " + name);
    }

    ;
}
