package lab_2;

public class ex_4 {
    public static void main(String[] args) {
        /*
            2.4 Write a program give example for command line arguments.
                2.4.1 To find the sum of command line arguments and count the invalid integers entered. x
                2.4.2 To get the name using command line. x
        */

        // javac <name>
        // java <package.name> arg1, arg2, arg3
        // Usage: java lab_2.ex_4 2 2 2 2 Jeremy James Jonathan 2 2

        int sum = 0;
        int invalid = 0;
        for (int i = 0; i < args.length; i++) {
            try {
                sum += Integer.parseInt(args[i]);
            } catch (Exception error) {
                System.out.println("Is " + args[i] + " your name?");
                ++invalid;
                continue;
            }
        }
        System.out.println("The total sum of command line arguments is: " + sum);
        System.out.println("The total ammount of invalid integers is: " + invalid);
    }
}
