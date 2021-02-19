package other;

public class SimpleMath {
    public static double div(double i, double j) throws ArithmeticException {
        try {
            if (j == 0) {
                throw new ByZeroExeption("You can't divide by 0.");
            }
            double result = (i / j);
            return result;
        } catch (ByZeroExeption exeption) {
            exeption.printStackTrace();
            return 0;
        }
    }
    public static void noZero(int i) throws NoZeroException {
        if (i == 0) {
            throw new NoZeroException(NoZeroException.noZerroMessage);
        }
    }
}
