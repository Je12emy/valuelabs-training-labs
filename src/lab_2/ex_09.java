package lab_2;

import java.util.ArrayList;
import java.util.Scanner;

public class ex_09 {

    static Scanner sc = new Scanner(System.in);
    static int rows;
    static int columns;

    static Matrix matrixA;
    static Matrix matrixB;

    static Matrix additionMatrix;


    public static void main(String[] args) {
        /*
        2.9 Write a program for calculating Matrix Operations.
            2.9.1 Addition. x
            2.9.2 Multiplication.
         */
        /*
        [ 1 4 45 ]   [ 8 10  75 ]   [ 1+8  4+10  45+75 ]
        [ 2 7 96 ] + [ 50 42 12 ] = [ 2+50 7+42  95+12 ]
        [ 3 9 63 ]   [ 51 79 98 ]   [ 3+51 9+79  63+98 ]
         */
        boolean run = true;
        String response;

        do {
            System.out.println("Please enter the matrix's dimensions:");
            System.out.print("Rows:");
            rows = Integer.parseInt(sc.nextLine());

            System.out.print("Columns:");
            columns = Integer.parseInt(sc.nextLine());

            System.out.println("Creating two matrixes with dimensions of:");
            System.out.println("-Rows: " + rows);
            System.out.println("-Columns: " + columns);
            System.out.print("Is this correct?(y/n): ");

            response = sc.nextLine();

            System.out.println();

            switch (response) {
                case "y":
                    matrixCreationMenu();
                    System.out.print("Exit program?(y/n): ");
                    response = sc.nextLine();
                    switch (response) {
                        case "y":
                            run = false;
                            break;
                        default:
                            continue;
                    }
                    break;
                default:
                    System.out.print("Exit program?(y/n): ");
                    response = sc.nextLine();
                    switch (response) {
                        case "y":
                            run = false;
                            break;
                        default:
                            continue;
                    }
                    continue;
            }


        } while (run);


    }

    public static void matrixCreationMenu() {
        boolean run = true;

        do {
            // Create Matrix A
            System.out.println("Creating Matrix A...");
            matrixA = createMatrix(rows, columns);

            System.out.println("Created Matrix A:");
            System.out.println();
            matrixA.print();

            System.out.println();

            System.out.println("Creating Matrix B..");
            matrixB = createMatrix(rows, columns);
            System.out.println("Created Matrix B:");
            matrixB.print();

            additionMatrix = matrixA.matrixAddition(matrixB);
            System.out.println("Added Matrix:");
            additionMatrix.print();
            run = false;

        } while (run);
    }

    public static Matrix createMatrix(int rows, int columns) {
        boolean run = true;
        Matrix matrix = new Matrix(rows, columns);
        int cell;

        do {
            for (int i = 0; i < matrix.getRows(); i++) {
                ArrayList<Integer> row = new ArrayList<>();
                for (int j = 0; j < matrix.getColumns(); j++) {
                    try {
                        System.out.print("Please insert the value for row " + (i + 1) + " in column " + (j + 1) + ": ");
                        cell = Integer.parseInt(sc.nextLine());
                        row.add(cell);

                    } catch (Exception e) {
                    }
                }
                matrix.addRow(row);
                System.out.println();
            }
            run = false;
        } while (run);

        return matrix;
    }
}
