package lab_2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ex_2 {
    public static void main(String[] args) {
        /*
        2.2 Write a program to give the example of control statements.
            2.2.1 If statements. x
            2.2.2 Switch Statements. x
            2.2.3 For loop. x
            2.2.4 While Statements. x
            2.2.5 Do statements x
        */

        int response = 0;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("How many times would like to print the character '*' ? [Press 0 to exit]");
            response = Integer.valueOf(sc.nextLine());
            switch (response) {
                case 0:
                    System.out.println("Are you sure you want to exit? [Press 0 to exit]");
                    response = Integer.valueOf(sc.nextLine());
                    if (response == 1) {
                        continue;
                    }
                    int x = 0;

                    while( x <= 10){
                        System.out.print("*");
                        x++;
                    }
                    System.out.println("\nExiting program...\nThank you!");
                    break;

                default:
                    System.out.println("The character '*' will be printed " + response + " times:");
                    for (int i = 0; i < response; i++) {
                        System.out.print("*");
                    }
                    System.out.println("\n");
                    break;
            }
        } while (response != 0);
    }
}
