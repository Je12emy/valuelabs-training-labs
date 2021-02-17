package lab_2;

public class ex_5 {
    public static void main(String[] args) {
        /*
        2.5 Write a program to print the following triangle of binary digits.
        2.5.1

            1
            1 0 1
            1 0 0 0 1
            1 0 0 0 0 0 1
            1 0 0 0 0 0 0 1

            2.5.2

            5
            4 5
            3 4 5
            2 3 4 5
            1 2 3 4 5
            0 1 2 3 4 5


            2.5.3

            1
            1 2
            1 2 3
            1 2 3 4
            1 2 3 4 5
         */

        String tri1 = "1";
        for (int i = 0; i < 5; i++) {
            System.out.println(tri1);
            tri1 = tri1 + "0" + "1";
        }
    }
}
