package other;

public class NoZeroException extends Exception {

    static String noZerroMessage = "Value 0 is not allowed";
    
    NoZeroException(String s){
        super(s);
    }
}
