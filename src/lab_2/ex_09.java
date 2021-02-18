package lab_2;

import java.util.ArrayList;
import java.util.Scanner;

public class ex_09 {

    static Scanner sc = new Scanner(System.in);
    static int rows;
    static int columns;

    static String operation;
    static final String ADD = "matrix_adition";
    static final String MULTIPLY = "matrix_multiplication";

    static Matrix matrixA;
    static Matrix matrixB;
    static Matrix auxMatrix;


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

        // Request operation

        // Create matrices
        // Validate dimensions
        // Execute operations
        App();

    }

    public static void App() {
        Boolean run = true;
        String response;
        do {
            System.out.println("Select a type of operation:");
            System.out.println("1. Addition.\n2. Multiplication.\n3. Exit");
            System.out.print("\nEnter an option:");
            response = sc.nextLine();

            switch (response) {
                case "1":
                    operation = ADD;
                    break;
                case "2":
                    operation = MULTIPLY;
                    break;
                case "3":
                    run = false;
                    break;
                default:
                    continue;
            }
            boolean runOperation = true;
            do {
                System.out.println("Creating Matrix A");
                dimensionCreationMenu();
                matrixA = createMatrix();
                matrixA.print();

                System.out.println("Creating Matix B");
                dimensionCreationMenu();
                matrixB = createMatrix();
                matrixB.print();

                if (isValid()) {
                    if (operation == ADD) {
                        auxMatrix = matrixA.matrixAddition(matrixB);
                        System.out.println("Adding Matrices");
                        auxMatrix.print();
                    } else if (operation == MULTIPLY) {
                        auxMatrix = matrixA.multiply(matrixB);
                        System.out.println("Multiplying Matrices");
                        auxMatrix.print();
                        runOperation = false;
                    }

                }
            } while (runOperation);


        } while (run);
    }

    public static void dimensionCreationMenu() {
        boolean run = true;
        String response;
        do {
            System.out.println("Please enter the matrix's dimensions:");
            System.out.print("Rows:");
            rows = Integer.parseInt(sc.nextLine());

            System.out.print("Columns:");
            columns = Integer.parseInt(sc.nextLine());

            System.out.println("Creating a matrix with dimensions of:");
            System.out.println("-Rows: " + rows);
            System.out.println("-Columns: " + columns);
            System.out.print("Is this correct?(y/n): ");

            response = sc.nextLine();

            System.out.println();

            switch (response) {
                case "y":
                    run = false;
                    break;
                default:
                    continue;
            }
        } while (run);
    }

    public static Matrix createMatrix() {
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

    public static boolean isValid() {
        if (operation == ADD) {
            if (matrixA.getRows() != matrixB.getRows()) {
                return false;
            } else if (matrixA.getColumns() != matrixB.getColumns()) {
                return false;
            }
        } else if (operation == MULTIPLY) {
            if (matrixA.getColumns() != matrixB.getRows()) {
                return false;
            }
        }
        return true;
    }
}

