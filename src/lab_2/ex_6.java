package lab_2;

import java.util.Scanner;

public class ex_6 {
    public static void main(String[] args) {
       /*
       2.6. Write a program to the find the following
            2.6.1 Prime number checking x
            2.6.2 Sum of digit x
        */
        String input;
        int num;
        boolean isPrime = true;

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a number");
        input = sc.nextLine();
        try {
            num = Integer.parseInt(input);
            String[] numberArray = input.split("");
            for (int i = 2; i < num; i++) {
                // If the residue is 0, it means it is divisible by another number.
                if (num == 1) {
                    isPrime = true;
                    break;
                }
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(num + " is a prime number");
            } else {
                System.out.println(num + " is not a prime number");
            }
            int sum = 0;

            for (int i = 0; i < numberArray.length; i++) {
                sum = sum + Integer.parseInt(numberArray[i]);
            }

            System.out.println("The sum of the digits is: " + sum);

        } catch (Exception exception) {
            System.out.println("The entered value is not a number!:");
        }


    }
}
