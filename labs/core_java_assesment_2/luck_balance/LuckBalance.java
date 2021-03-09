package core_java_assesment_2.luck_balance;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class LuckBalance {
    public static void main(String[] args) {
        int[][] contestMatrix; // = { { 5, 1 }, { 2, 1 }, { 1, 1 }, { 8, 1 }, { 10, 0 }, { 5, 0 } };
        int k, n;
        int luckBalance = 0;
        String[] input;
        Scanner sc = new Scanner(System.in);
        System.out.println("Luck Balance");
        try {
            System.out.print("Please enter the number of contests and max loses: ");
            input = sc.nextLine().split(" ");

            n = Integer.parseInt(input[0]);
            k = Integer.parseInt(input[1]);

            // Asign the matrix size
            contestMatrix = new int[n][2];

            // Capture values
            for (int i = 0; i < n; i++) {
                System.out.print("Please enter the values for contest " + (i + 1) + " [Format: #Luck #Importance]: ");
                input = sc.nextLine().split(" ");
                contestMatrix[i][0] = Integer.parseInt(input[0]);
                contestMatrix[i][1] = Integer.parseInt(input[1]);
            }

            calculateLuckBalance(contestMatrix, luckBalance, k);

        } catch (NumberFormatException e) {
            System.out.println("Please use numbers");
        }

    }

    private static void calculateLuckBalance(int[][] contestMatrix, int luckBalance, int k) {
        // Sort based on luck balance asc
        Arrays.sort(contestMatrix, new Comparator<int[]>() {

            @Override
            public int compare(int[] arg0, int[] arg1) {
                Integer luckBalance1 = arg0[0];
                Integer luckBalance2 = arg1[0];
                return -luckBalance1.compareTo(luckBalance2);
            }

        });

        // Sort based on importance asc
        // Arrays.sort(contestMatrix, new Comparator<int[]>() {

        // @Override
        // public int compare(int[] arg0, int[] arg1) {
        // Integer luckBalance1 = arg0[1];
        // Integer luckBalance2 = arg1[1];
        // return -luckBalance1.compareTo(luckBalance2);
        // }

        // });

        // Sort based on importance asc, w/ lambda
        // src here:
        // https://stackoverflow.com/questions/21970719/java-arrays-sort-with-lambda-expression
        Arrays.sort(contestMatrix, (Comparator<int[]>) (int[] ob1, int[] ob2) -> ob1[1] - ob2[1]);

        for (int i = 0; i < contestMatrix.length; i++) {
            // If contest is not important, loose it and add up
            if (isNotImportant(contestMatrix[i][1])) {
                luckBalance += contestMatrix[i][0];
            } else {
                // If we have not hit the loss limit
                if (isNotMaxLoses(k)) {
                    // Loose and add up balance
                    luckBalance += contestMatrix[i][0];
                    k--;
                } else {
                    // Win and reduce balance
                    luckBalance -= contestMatrix[i][0];
                }
            }

        }
        System.out.println("Max Luck balance: "+luckBalance);
    }

    private static boolean isNotImportant(int contestType) {
        return contestType == 0;
    }

    private static boolean isNotMaxLoses(int k) {
        return k > 0;
    }
}
