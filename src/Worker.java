import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;


public class Worker {
    private String name;
    private String birthDate;
    private String endDate;

    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("dd-MM-yyyy");


    public Worker (String name, String birthDate) {
        try {
            LocalDate.parse(birthDate, FORMATTER);
        } catch (DateTimeParseException e) {
            // remember to handle the exception in the Main method
            throw new IllegalArgumentException("Invalid date format. Please use dd-MM-yyyy.");
        }
        this.name = name;
        this.birthDate = birthDate;
    }

    public int getAge() {
        LocalDate birthDateParsed = LocalDate.parse(birthDate, FORMATTER);
        LocalDate currentDate = LocalDate.now();
        return Period.between(birthDateParsed, currentDate).getYears();
    }

    public String getName() {
        return name;
    }
    
    public String getBirthDate() {
        return birthDate;
    }

    public double collectPay() {
        return -1;
    }

    public void setEndDate(String endDate) {
        try {
            LocalDate.parse(endDate, FORMATTER);
        } catch (DateTimeParseException e) {
            // remember to handle the exception in the Main method
            throw new IllegalArgumentException("Invalid date format. Please use dd-MM-yyyy.");
        }
        this.endDate = endDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void terminate(String endDate) {
        if (endDate != null) {
            System.out.println("Contract termination on " + LocalDate.parse(endDate, FORMATTER));
        } else {
            System.out.println("There is no contract termination date.");
        }
    }

}
