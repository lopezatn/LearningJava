import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Printer printer = new Printer(50, false);

        printer.printPages(12);
        printer.addToner(124);
        System.out.println(printer.addToner(124));

        // SmartKitchen kitchen = new SmartKitchen();

        // kitchen.setKitchenState(true, false, true);
        // kitchen.doKitchenWork();

        // kitchen.getBrewMaster().setHasWorkToDo(true);
        // kitchen.getIceBox().setHasWorkToDo(true);
        // kitchen.getDishWasher().setHasWorkToDo(true);

        // kitchen.getBrewMaster().brewCoffee();
        // kitchen.getDishWasher().doDishes();
        // kitchen.getIceBox().orderFood();        

        // SalariedEmployee employee = new SalariedEmployee("Trevor Belmont", "01-01-1980", 123456789, "11-01-2020", 120000);
        // System.out.println("Employee name: " + employee.getName());
        // System.out.println("Employee age: " + employee.getAge());
        // System.out.println("Employee monthly salary: " + employee.collectPay());
        // System.out.println("Employee ID: " + employee.getEmployeeId());
        // System.out.println("Employee birth date: " + employee.getBirthDate());
        // System.out.println("Employee annual salary: " + employee.getAnnualSalary());
        // System.out.println("Employee hire date: " + employee.getHireDate());
        // employee.setEndDate("15-04-2024");
        // System.out.println("Employee end date: " + employee.getEndDate());

        // Try to terminate an employee.



        // BankAccount myAccount = new BankAccount();
    
        // myAccount.setAccountNumber(8884);
        // myAccount.setAccountBalance(0);
        // myAccount.setCustomerName("Trevor Belmont");
        // myAccount.setEmailAddress("trevor@housebelmont.com");
        // myAccount.setPhoneNumber(123456789);
    
        // myAccount.accountInformation();
        // myAccount.depositFunds(50000);
        // myAccount.withdrawFunds(40000);
        
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

    
    public static boolean isLeapYear (int year) {
        if (year < 1 || year > 9999) {
            return false;
        }
        
        if (year % 4 != 0) {
            return false;
        } else if (year % 100 != 0) {
            return true;
        } else if (year % 400 == 0) {
            return true;
        } else {
            return false;
        }

    }
    
    public static int getDaysInMonth (int month, int year) {
        if (month < 1 || month > 12) {
            return -1;
        } else if (year < 1 || year > 9999) {
            return -1;
        }
        
        int daysInMonth = switch (month) {
            case 1 -> 31;
            case 2 -> isLeapYear(year) ? 29 : 28;
            case 3 -> 31;
            case 4 -> 30;
            case 5 -> 31;
            case 6 -> 30;
            case 7 -> 31;
            case 8 -> 31;
            case 9 -> 30;
            case 10 -> 31;
            case 11 -> 30;
            case 12 -> 31;
            default -> -1;
        };
        return daysInMonth;

    }
    // end of switch statements

    // numbers and for loops

    public static boolean isPrime (int number) {
        
        for (int divisor = 2; divisor <= (number / 2); divisor++) {
            if (number % divisor == 0) {
                return false;
            }
        }
        return true;
    }

    public static void primeNumbersCounter () {
        for (int counter = 0; counter <= 3;) {
            if (counter == 3) {
                break;
            }
            int randomNumber = (int) (Math.random() * 1000) + 1;
            if (isPrime(randomNumber)) {
                System.out.println(randomNumber + " is prime");
            }
        }
    }

    public static void sum3And5 () {
        int sum = 0;
        int counter = 0;
        for (int i = 1; i <= 1000; i++) {
            if (counter == 5) {
                break;
            } else if (i % 3 == 0 && i % 5 == 0) {
                sum += i;
                counter++;
                System.out.println("The counting is at " + counter);
                System.out.println("The number is " + i);
                System.out.println("The sum is " + sum);
            }
        }
        System.out.println("Final result: " + sum);
    }

    // end of numbers and for loops

    // while loop

    public static boolean isEvenNumber (int number) {
        if (number % 2 == 0) {
            return true;
        }
        return false;
    }

    public static void printEvenNumbers () {
        int number = 5;
        int evenNumbersFound = 0;
        int oddNumbersFound = 0;

        do {
            if (isEvenNumber(number)) {
                evenNumbersFound++;
                System.out.println("Even number: " + number);
                number++;        
            } else {
                oddNumbersFound++;
                System.out.println("Odd number: " + number);
                number++;
            }
        } while (evenNumbersFound != 5);
        System.out.println("The amount of even numbers found is: " + evenNumbersFound);
        System.out.println("The amount of odd numbers found is: " + oddNumbersFound);

        // while (number <= 20) {
        //     if (isEvenNumber(number)) {
        //         System.out.println(number);
        //     }
        //     number++;
        // }
    }

    public static int sumDigits (int number) {
        if (number < 0) {
            return -1;
        }
        int sum = 0;
        int lastDigit = 0;
        while (number > 0) {
            lastDigit = number % 10;
            sum += lastDigit;
            number = number / 10;
        }
        return sum;

    }

    // end of while loop

    // user input

    public static int sumInputNumbers () {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        int sum = 0;
        int numberSequence = 1;

        do {
            try {
                System.out.println("Enter number #" + numberSequence + ":");
                number = Integer.parseInt(scanner.nextLine());
                sum += number;
                numberSequence++;
            } catch (NumberFormatException e) {
                System.out.println("Invalid number, please use integers");
            }            
        } while (numberSequence <= 5);
        scanner.close();
        
        return  sum;
    }

    public static int trackMinAndMaxNumbers () {
        Scanner scanner = new Scanner(System.in);
        int minNumber = Integer.MIN_VALUE;
        int maxNumber = Integer.MAX_VALUE;
        String input = "";
        int counter = 0;
        boolean isNumber = true;

        do {
            String numberSequence = switch (counter) {
                case 0 -> "Enter the first number. Enter a character to EXIT";
                case 1 -> "Enter the second number. Enter a character to EXIT";
                case 2 -> "Enter the third number. Enter a character to EXIT";
                case 3 -> "Enter the fourth number. Enter a character to EXIT";
                case 4 -> "Enter the fifth number. Enter a character to EXIT";
                case 5 -> "Enter the sixth number. Enter a character to EXIT";
                default -> "Keep entering numbers or a character to Exit";
            };
            
            System.out.println(numberSequence);
            input = scanner.nextLine();
            try {
                int number = Integer.parseInt(input); // Checking if the input converts to number
                counter++;
                if (number > maxNumber) {
                    maxNumber = number;
                } else if (number < minNumber) {
                    minNumber = number;
                }
            } catch (NumberFormatException e) {
                isNumber = false; // exit the loop since the input is not a number
            }

        } while (isNumber);
        System.out.println("Minimum value registered: " + minNumber);
        System.out.println("Maximum value registered: " + maxNumber);
        scanner.close();
        return 1;
    }
    // end user input

    // OOP - Classes & methods

    public static class BankAccount {
        
        // class properties
        private long accountNumber;
        private long accountBalance;
        private String customerName;
        private String emailAddress;
        private long phoneNumber;

        // class getters and setters
        public long getAccountNumber() {
            return accountNumber;
        }
        public void setAccountNumber(long accountNumber) {
            this.accountNumber = accountNumber;
        }
        public long getAccountBalance() {
            return accountBalance;
        }
        public void setAccountBalance(long accountBalance) {
            this.accountBalance = accountBalance;
        }
        public String getCustomerName() {
            return customerName;
        }
        public void setCustomerName(String customerName) {
            this.customerName = customerName;
        }
        public String getEmailAddress() {
            return emailAddress;
        }
        public void setEmailAddress(String emailAddress) {
            this.emailAddress = emailAddress;
        }
        public long getPhoneNumber() {
            return phoneNumber;
        }
        public void setPhoneNumber(long phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        public void accountInformation () {
            System.out.println("Welcome back " + customerName);
        }

        public void depositFunds (long amount) {
            System.out.println("Previous funds: " + accountBalance);
            accountBalance += amount;
            System.out.println("Current funds: " + accountBalance);
        }
        
        public void withdrawFunds (long amount) {
            if (amount > accountBalance) {
                System.out.println("The amount to withdraw exceeds your account funds");
                return;
            }
            System.out.println("Previous account balance: " + accountBalance);
            accountBalance -= amount;
            System.out.println("Current account balance is: " + accountBalance);
        }
    }

    public static class Customer {
        private String name;
        private long creditLimit;
        private String emailAddress;

        public Customer(String name, long creditLimit, String emailAddress) {
            this.name = name;
            this.creditLimit = creditLimit;
            this.emailAddress = emailAddress;
        }

        public Customer() {
            this(
            "Trevor Belmont", 
            "trevor@belmonthouse.com"
            );
        }

        public Customer(String name, String emailAddress) {
            this("Trevor Belmont II", 100000, "trevorII@belmonthouse.com");
        }

        public void getName() {
         
        }

        public void getCreditLimit() {
            
        }

        public void getEmailAddress() {
            
        }
    }

    // end of OOP - Classes & methods

}
