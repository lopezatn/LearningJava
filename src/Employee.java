import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Employee extends Worker {
    private long employeeId;
    private String hireDate;

    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("dd-MM-yyyy");

    public Employee(String name, String birthDate, long employeeId, String hireDate) {
        super(name, birthDate);
        this.employeeId = employeeId;

        try {
            LocalDate.parse(hireDate, FORMATTER);
        } catch (DateTimeParseException e) {
            throw new IllegalArgumentException("Invalid date format for hireDate. Please use dd-MM-yyyy.");
        }
        this.hireDate = hireDate;
    }

    public String getHireDate() {
        return hireDate;
    }

    public long getEmployeeId() {
        return employeeId;
    }
    
}
