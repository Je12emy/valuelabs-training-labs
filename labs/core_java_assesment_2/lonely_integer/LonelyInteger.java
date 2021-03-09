package core_java_assesment_2.lonely_integer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LonelyInteger {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String[] input;
        boolean run = true;
        int size;
        do {
            try {
                System.out.println("Lonely Integer");
                System.out.print("Please enter the array size: ");
                size = Integer.parseInt(sc.nextLine());

                System.out.println();
                System.out.println("Please enter the values for the array separated by space");

                input = sc.nextLine().split(" ");

                for (int i = 0; i < input.length; i++) {
                    numbers.add(Integer.parseInt(input[i]));
                }

                getUnique(numbers);
                numbers.clear();

            } catch (NumberFormatException e) {
                System.out.println("Please use numbers only!");
            }

        } while (run);
    }

    private static void getUnique(List<Integer> numbers) {
        int matches = 0;
        for (int i = 0; i < numbers.size(); i++) {
            for (int j = 0; j < numbers.size(); j++) {
                if (numbers.get(i) == numbers.get(j)) {
                    matches++;
                }
            }

            if (matches == 1) {
                System.out.println(numbers.get(i));
            }

            if (matches == numbers.size()) {
                System.out.println(numbers.get(0));
                break;
            }
            matches = 0;

        }
    }
}
