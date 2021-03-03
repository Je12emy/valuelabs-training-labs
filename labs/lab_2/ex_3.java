package lab_2;

public class ex_3 {
    public static void main(String[] args) {
        /*
        2.3 Write a program to calculate the following
            2.3.1 Find the length of array. x
            2.3.2 Demonstrate a one-dimensional array. x
            2.3.3 Demonstrate a two-dimensional array. x
            2.3.4 Demonstrate a multi-dimensional array. x
         */

        int[] arr1d = {1,2,3,4,5};
        int[][] arr2d = {{1,2,3,4,5}, {5,4,3,2,1}};
        int[][][] arr3d = {{{1,2,3,4,5}, {5,4,3,2,1}, {1,3,2,4,5}}, { {5,6,7,8,9}, {9,8,7,6,5}, {5,9,6,7,8} }};

        System.out.println("Number of elements in the array: " + arr1d.length);

        System.out.println("Types of Arrays: \nOne-dimensional array with: 1 row and 5 columns");

        System.out.println("---------------");
        for (int i = 0; i < arr1d.length; i++) {
            System.out.print("|" + arr1d[i] + "|");
        }
        System.out.println("\n---------------");

        System.out.println("Two-dimensional array with: 2 rows and 5 columns");
        for (int i = 0; i < arr2d.length; i++) {
            System.out.println("\n---------------");
            for (int j = 0; j < arr2d[i].length; j++) {
                System.out.print("|" + arr2d[i][j] + "|");
            }
        }
        System.out.println("\n---------------");

        System.out.println("Multi-dimensional array with: 2 rows, 3 columns with 3 pages each");
        for (int i = 0; i < arr3d.length; i++) {
            System.out.println("\n------------------------------------------------");
            for (int j = 0; j < arr3d[i].length; j++) {
                System.out.print("~");
                for (int k = 0; k < arr3d[i][j].length; k++) {
                    System.out.print("|" +arr3d[i][j][k] + "|");
                }
            }
        }
        System.out.println("\n------------------------------------------------");
    }
}
