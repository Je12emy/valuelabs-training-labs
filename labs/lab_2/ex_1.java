package lab_2;

public class ex_1 {
    public static void main(String[] args) {
        int n = 0;
        System.out.println("\n~~Increment and decrement operators~~");
        System.out.println("Given a integer variable 'n' with a value of 0");
        System.out.println("We can increment and decrement it's value with simply using the operators ++n o --n :" + ++n);
        System.out.println("Order is very important since using these operators indice the order in which the operation is done\n"+
                "If we use it before the operation is executed else, the value will be read before incrementing "+ n++);

        // TODO: Understand complement operation, besides flipping something else is needed?
        int bitWiseNum = 5;
        System.out.println("\n~~Bitwise Complement Operators~~");
        System.out.println("Given a variable 'n' with a value of 5 whose binary representation is 0101");
        System.out.println("The complement operator turns all 0's into 1's and all 1's into 0's");
        System.out.println("This means 1010 would be converted into 1010 or a  " + ~bitWiseNum);

        System.out.println("\n~~Aritmetic Operator~~");
        System.out.println("Besides the common arithmetic operator we have % (modulus) which returns the remainder from a division: " + 12%5);

        System.out.println("\n~~Relational Operator~~");
        System.out.println("These can be used for comparing values say; is 1 greater than 2?: " + (1>2));

        System.out.println("\n`~~Bitwise Operator~~");
        System.out.println("These can be used to evaluate values, they depend on truth tables: (true and true?): " + (true && true));

        int num = 1;
        int num2 = (num == 5) ? 50 : 42;
        System.out.println("\n~~Conditional Operator~~");
        System.out.println("A very popular syntax in React, this is a short hand way of creating a if statement"+
                "\n <<expression>> ? true : then: " + num2);
    }
}
