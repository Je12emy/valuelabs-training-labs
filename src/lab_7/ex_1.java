package lab_7;

public class ex_1 {
    public static void main(String[] args) {
        ColorChecking colorChecking = new ColorChecking();
        colorChecking.setRGB("(54,155,229)");
        System.out.println("Hue is: " + colorChecking.getHue());
        System.out.println("Brightness/Luminosity is " + colorChecking.getLuminosity());
        System.out.println("Saturation is: " + colorChecking.getSaturation());
    }
}
