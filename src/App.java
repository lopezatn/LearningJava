public class App {

    public static void main(String[] args) {

        switchEnhancedStatementWeekDay(7);

    }

    // overloaded methods:
    public static double convertToCentimeters(int inches) {
        return inches * 2.54;
    }

    public static double convertToCentimeters(int feet, int inches) {
        return convertToCentimeters((int) feet*12+inches);
    }

    public static String getDurationString (int seconds) {
        if (seconds < 0) {
            return String.format("The seconds must be a positive integer.");
        }

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
        if (minutes < 0 || seconds < 0 || seconds > 59 ) {
            return String.format("Integers must be positive and seconds can't be bigger than 59");
        }

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

    // switch statements

    public static void switchStatementLetter(char letter) {

        switch (letter) {
            case 'A':
                System.out.println(letter + " = Able");
                break;
            case 'B':
                System.out.println(letter + " = Baker");
                break;
            case 'C':
                System.out.println(letter + " = Charlie");
                break;
            case 'D':
                System.out.println(letter + " = Dog");
                break;
            case 'E':
                System.out.println(letter + " = Easy");
                break;
            default:
                System.out.println(letter + " not found");
                break;
        }
    }

    public static void switchEnhancedStatementWeekDay(int day) {

        String dayOfTheWeek = switch (day) {
            case 0 -> "Sunday";
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "Invalid day";
            };

        System.out.println(dayOfTheWeek);
    }
    // switch statements
}
