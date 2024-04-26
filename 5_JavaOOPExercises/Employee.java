import java.math.BigDecimal;

public class Employee extends Person{
    private String title;
    private String employer;
    private int employeeGrade;
    private BigDecimal salary;


    public Employee(String name, String phone, String email, String title, String employer, int employeeGrade, BigDecimal salary) {
        super(name, phone, email);
        this.title = title;
        this.employer = employer;
        this.employeeGrade = employeeGrade;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() + " Employee{" +
                "title='" + title + '\'' +
                ", employer='" + employer + '\'' +
                ", employeeGrade=" + employeeGrade +
                ", salary=" + salary +
                '}';
    }

    public static void main(String[] args) {
        Employee lucas = new Employee("Lucas", "1234567", "luc@mail.com", "software engineer", "codeBanks", 9, new BigDecimal("200000"));
        System.out.println(lucas);
    }
}
