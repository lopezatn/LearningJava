public class App {

    public static void main(String[] args) {

        System.out.println(getDurationString(9200));
        System.out.println(getDurationString(90, 240));

    }

    // overloaded methods:
    public static double convertToCentimeters(int inches) {
        return inches * 2.54;
    }

    public static double convertToCentimeters(int feet, int inches) {
        return convertToCentimeters((int) feet*12+inches);
    }

    public static String getDurationString (int seconds) {
        int minutes = 0;
        int hours = 0;

        while (seconds >= 3600) {
            hours++;
            seconds -= 3600;
        } 
        while (seconds >= 60) {
            minutes++;
            seconds -= 60;   
        }
        return String.format("%02dh %02dm %02ds", hours, minutes, seconds);
    }

    public static String getDurationString (int minutes, int seconds) {
        int hours = 0;

        while (seconds >= 60) {
            minutes++;
            seconds -= 60;
        }

        while (minutes >= 60) {
            hours++;
            minutes -= 60;
        }

        return String.format("%02dh %02dm %02ds", hours, minutes, seconds);
    }
    // end of overloaded methods
}
