package lab_4;

public class ex_3_4_5 {
    public static void main(String[] args) {
        /*
        4.3 Create class named as ‘a’ and create a sub class ‘b’. Which is extends from class ‘a’. And use these classes in ‘inherit’ class. x
        4.4 Write a program to give the example for method overriding concepts. x
        4.5 Write a program to give the example for ‘super’ keyword. x
         */
        Phone myPhone = new Phone("Smartphone", "6 GB", "64 GB", "Snapdragon835", "10mp", "1080p");
        System.out.println(myPhone.getStorage());
    }
}
