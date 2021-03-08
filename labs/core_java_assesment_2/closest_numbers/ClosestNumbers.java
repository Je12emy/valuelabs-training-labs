package core_java_assesment_2.closest_numbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import core_java_assesment_1.InvalidValueExeption;

public class ClosestNumbers {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> sortedArr = new ArrayList<>();
        boolean run = true;
        int size;
        String[] input;

        do {

            System.out.println("---------------");
            System.out.println("Closest Numbers");
            System.out.println("---------------");
            System.out.print("Please enter the size of the array: ");
            try {
                size = Integer.parseInt(sc.nextLine());

                if (2 < size && size < 20000) {

                    System.out.println("Please enter the elements to be included in the array separated by space [1 2 3 4 5]: (You can copy and paste them)");
                    input = sc.nextLine().split(" ");

                    // Validate items
                    for (int j = 0; j < input.length; j++) {
                        int k = Integer.parseInt(input[j]);

                        // Check if valid
                        if (Math.pow(-10, 7) < k && k < Math.pow(10, 7)) {
                            // Add values
                            arr.add(k);
                        } else {
                            throw new InvalidValueExeption(k + " is not a valid value in the array");
                        }

                    }
                    Collections.sort(arr);

                    // Check if there are duplicates
                    if (getDuplicated(arr) == 0) {
                        closestNumbers(arr, sortedArr);
                        arr.clear();
                        sortedArr.clear();
                    } else {
                        throw new InvalidValueExeption("Duplicates are not allowed");
                    }

                } else {
                    throw new InvalidValueExeption(size + " is not a valid array size.");
                }

            } catch (NumberFormatException e) {
                // TODO: handle exception
                System.out.println("You've entered an invalid value");
            } catch (InvalidValueExeption e) {
                System.out.println(e.getMessage());
            }
        } while (run);
    }

    public static void closestNumbers(List<Integer> arr, List<Integer> sortedArr) {
        int difference = 0;
        for (int i = 0; i < arr.size(); i++) {

            if (i == 0) {
                difference = getDiference(arr.get(i), arr.get(i + 1));
            }

            if (i == arr.size() - 1) {
                break;
            }

            if (getDiference(arr.get(i), arr.get(i + 1)) <= difference) {

                if (getDiference(arr.get(i), arr.get(i + 1)) < difference) {
                    sortedArr.clear();
                    difference = getDiference(arr.get(i), arr.get(i + 1));
                }
                sortedArr.add(arr.get(i));
                sortedArr.add(arr.get(i + 1));
            }
        }
        System.out.print("Output: ");
        for (int i = 0; i < sortedArr.size(); i++) {
            System.out.print(sortedArr.get(i) + " ");
        }
        System.out.println();

    }

    public static int getDuplicated(List<Integer> arr) {
        int duplicates = 0;

        for (int i = 0; i < arr.size(); i++) {
            if (i == arr.size() - 1) {
                break;
            }

            if (arr.get(i) == arr.get(i + 1)) {
                duplicates++;
            }
        }
        return duplicates;
    }

    public static int getDiference(int a, int b) {
        if ((a - b) < 0) {
            return (a - b) * -1;
        }
        return a - b;
    }
}
