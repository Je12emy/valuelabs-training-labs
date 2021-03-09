package core_java_assesment_2.marcs_cakewalk;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class CakeWalk {
    public static void main(String[] args) {
        int j;
        Integer[] cupcakes;
        String[] input;
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Marc's Cakewalk");
            System.out.print("Please enter how many cupcakes Marc has eaten: ");
            j = Integer.parseInt(sc.nextLine());

            // Define matrix size
            cupcakes = new Integer[j];

            System.out.print("Please enter each cupcake's calorie count [Format: c1 c2 c3 c4 ...]: ");
            input = sc.nextLine().split(" ");

            for (int i = 0; i < input.length; i++) {
                cupcakes[i] = Integer.parseInt(input[i]);
            }

            Arrays.sort(cupcakes, Collections.reverseOrder());
            calorie(cupcakes);
        } catch (Exception e) {
            // TODO: handle exception
        }

    }

    private static void calorie(Integer[] cupcakes) {
        double distance = 0;
        double result;

        for (int i = 0; i < cupcakes.length; i++) {
            result = Math.pow(2, i) * cupcakes[i];
            distance += result;
        }
        System.out.println("Mark should walk atleast " + distance + " miles.");
    }
}
