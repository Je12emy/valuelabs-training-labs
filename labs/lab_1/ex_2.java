package lab_1;

public class ex_2 {
    public static void main(String[] args) {
        System.out.println("Write a Java program to display default value of all primitive data types of Java.");
        // Integer types
        byte by = 1;
        short s = 1;
        int n = 1;
        long l = 123L;

        // Floating point types
        float f = 42.123F;
        double d = 42.42;

        // String and char
        char c = 'c';
        String str = "Hello Valuelabs";

        boolean isTrue = true;
       System.out.println("For integer types we have:" +
               "\n  -byte: " + by +
               "\n  -short: " + s +
               "\n  -int: " + n +
               "\n  -l: Which need a L after the assigned value "+ l +
               "\nFor floating point types we have these two" +
               "\n  -double: " + d +
               "\n  -float: Which is ideal for mathematical operations and is more precise, it also need F after the value " + f +
               "\nFor string we have:" +
               "\n  -char: which need single quotes and can only store a single character " + c +
               "\n  -String: Which is actually a wrapping object and it provides us to many properties .len" + str +
               "\nAnd finally for booleans we have bool:" +
               "\n  -boolean:" + isTrue);
    }
}
