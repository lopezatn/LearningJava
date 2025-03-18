public class App {

    public static void main(String[] args) {
        System.out.println("inches to cm = " + convertToCentimeters(2));
        System.out.println("feet + inches to cm = " + convertToCentimeters(2, 4));
    }

    public static double convertToCentimeters(int inches) {
        double inchesToCms = inches * 2.54;

        return inchesToCms;
    }

    public static double convertToCentimeters(int feet, int inches) {
        int totalInches = (int) feet * 12 + inches;

        double resultOfInches = convertToCentimeters(totalInches);
        return resultOfInches;
    }

}
