package other;

/**
 * ErrorHandling
 */
public class ErrorHandling {
    public static void main(String[] args) {
        double result;
        result = SimpleMath.div(4, 0);

        try {
            SimpleMath.noZero(0);
        } catch (NoZeroException e) {
            e.printStackTrace();
        }
       
    }
}