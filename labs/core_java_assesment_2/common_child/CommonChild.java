package core_java_assesment_2.common_child;

import java.util.Scanner;

import core_java_assesment_1.InvalidValueExeption;

public class CommonChild {
    // NOTE: Could not accomplish case 2 and 3, avoiding child character rearrengement
    public static void main(String[] args) {
        String s1;
        String s2;
        StringBuilder child = new StringBuilder();
        boolean run = true;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Plase enter the value for the first word:");
            s1 = sc.nextLine().toUpperCase();

            System.out.print("Please enter the value for the seccond word:");
            s2 = sc.nextLine().toUpperCase();

            try {
                // Validate for digits
                for (int i = 0; i < s1.length(); i++) {
                    if (Character.isDigit(s1.charAt(i)) || Character.isDigit(s2.charAt(i))) {
                        System.out.println();
                        throw new InvalidValueExeption("Only characters are allowed");
                    }
                }
                for (int i = 0; i < s1.length(); i++) {
                    for (int j = 0; j < s2.length(); j++) {

                        if (s1.charAt(i) == s2.charAt(j)) {
                            char match = s1.charAt(i);
                            // If the char is not found
                            if (child.indexOf(String.valueOf(match)) == -1) {
                                child.append(match);
                            }
                        }
                    }
                }
                System.out.println("Child String:" + child + ", size: " + child.length());
                child.setLength(0);
                System.out.println();
            } catch (Exception e) {
                System.out.println(e.getMessage());
                continue;
            }

        } while (run);

    }
}
