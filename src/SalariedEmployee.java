public class SalariedEmployee extends Employee {
    private double annualSalary;
    private boolean isRetired;

    public SalariedEmployee(String name, String birthDate, long employeeId, String hireDate, double annualSalary) {
        super(name, birthDate, employeeId, hireDate);
        this.annualSalary = annualSalary;
        this.isRetired = false;
    }

    public double collectPay() {
        return annualSalary / 12;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public void retire() {
        if (!isRetired) {
            System.out.println("Congratulations " + getName() + "! You are now retired.");
            isRetired = true;
        } else {
            System.out.println(getName() + ", you are already retired.");
        }
    }

}
