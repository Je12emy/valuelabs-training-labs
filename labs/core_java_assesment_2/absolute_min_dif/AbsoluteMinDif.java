package core_java_assesment_2.absolute_min_dif;

import java.util.Scanner;

import core_java_assesment_1.InvalidValueExeption;

public class AbsoluteMinDif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        String[] input;
        Integer[] numbers;

        try {
            System.out.print("Please enter the array size: ");
            size = Integer.parseInt(sc.nextLine());
            numbers = new Integer[size];

            System.out.print("Please enter the values for the numbers array: ");
            input = sc.nextLine().split(" ");

            for (int i = 0; i < input.length; i++) {
                numbers[i] = Integer.parseInt(input[i]);
            }

            if (input.length != size) {
                throw new InvalidValueExeption(
                        "The amount of values you insert, should match with the size specified!");
            }

            minimumAbsoluteDifference(numbers);

        } catch (InvalidValueExeption e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Use numbers only!");
        }

    }

    private static void minimumAbsoluteDifference(Integer[] arr) {
        Integer[] absDif = new Integer[arr.length];

        int abs_min = Integer.MAX_VALUE;

        for (int i = 0; i < absDif.length; i++) {
            for (int j = i + 1; j < absDif.length; j++) {
                abs_min = Math.min(abs_min, Math.abs(arr[i] - arr[j]));
            }
        }
        System.out.println(abs_min);
    }
}
