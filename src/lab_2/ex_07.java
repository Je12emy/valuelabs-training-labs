package lab_2;

import java.util.Arrays;

public class ex_07 {
    public static void main(String[] args) {
        /*
         2.7 Write a program to arrange the numbers in ascending order.
         */

        int []list = {2,2,1,4,5,6,7};
        for (int j = 0; j < list.length - 1; j++) {

            if (list[j] > list[j + 1]) {
                int temp = list[j];
                list[j] = list[j + 1];
                list[j + 1] = temp;
                j = -1;
            }
        }
        System.out.println(Arrays.toString(list));
    }
}
