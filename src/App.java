public class App {

    public static void main(String[] args) {
        System.out.println("inches to cm = " + convertToCentimeters(2));
        System.out.println("feet + inches to cm = " + convertToCentimeters(2, 4));
    }

    public static double convertToCentimeters(int inches) {
        return inches * 2.54;
    }

    public static double convertToCentimeters(int feet, int inches) {
        return convertToCentimeters((int) feet*12+inches);
    }

}
