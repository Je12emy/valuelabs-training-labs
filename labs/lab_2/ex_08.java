package lab_2;

public class ex_08 {
    public static void main(String[] args) {
        /*
        2.8 Write a program to calculate the roots of Quadratic equations.
         */
        double a,b,c;
        a = 75;
        b = 42;
        c = 9;
        double firstRoot, seccondRoot;

        double determinant = (b * b) - 4 * a * c;

        if (determinant > 0) {
            firstRoot = (-b + Math.sqrt(determinant)) / (2 * a);
            seccondRoot = (+b + Math.sqrt(determinant)) / (2 * a);

            System.out.println("First Root is: " + firstRoot + "\n Seccond Root is: " + seccondRoot);
        } else {
            double real = -b / (2 * a);
            double imaginary = Math.sqrt(-determinant) / (2 * a);
            System.out.format("root1 = %.2f+%.2fi", real, imaginary);
            System.out.format("\nroot2 = %.2f-%.2fi", real, imaginary);
        }

    }
}
