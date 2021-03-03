package lab_2;

import java.util.ArrayList;

public class ex_5 {
    public static void main(String[] args) {
        /*
        2.5 Write a program to print the following triangle of binary digits.
        2.5.1 x

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
        ArrayList<String> arr = new ArrayList<>();
        arr.add("1");
        printChar(arr);

        ArrayList<Integer> arr2 = new ArrayList<>();
        arr2.add(5);
        printNumsRev(arr2);

        ArrayList<Integer> arr3 = new ArrayList<>();
        arr3.add(0);
        printNums(arr3);
    }

    public static ArrayList<String> printChar(ArrayList<String> numbers) {
        if (numbers.size() == 10) {
            return numbers;
        }
        if (numbers.size() == 1) {
            System.out.println(numbers.toString());
            numbers.add("0");
            return printChar(numbers);
        }
        numbers.remove(numbers.size() - 1);
        numbers.add("0");
        numbers.add("1");
        System.out.println(numbers.toString());
        return printChar(numbers);
    }

    public static ArrayList<Integer> printNumsRev(ArrayList<Integer> numbers) {
        if (numbers.size() == 1) {
            System.out.println(numbers.toString());
            numbers.add(0,numbers.get(numbers.size() - 1) - 1);
            return printNumsRev(numbers);
        }

        if (numbers.get(0) == 0) {
            return numbers;
        }

        numbers.add(0, numbers.get(0) - 1);
        System.out.println(numbers.toString());
        return printNumsRev(numbers);
    }

    public static ArrayList<Integer> printNums(ArrayList<Integer> numbers) {
        if (numbers.size() == 1) {
            System.out.println(numbers.toString());
            numbers.add(numbers.get(0) + 1);
            return printNums(numbers);
        }
        if (numbers.size() == 6) {
            return numbers;
        }

        numbers.add(numbers.get(numbers.size() - 1) + 1);
        numbers.toString();
        System.out.println(numbers.toString());
        return printNums(numbers);
    }
}
