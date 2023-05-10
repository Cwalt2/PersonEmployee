public class Employee extends Person {
    private double salary;
    private int year;
    private String ssn;

    public Employee(String name, double salary, int year, String ssn) {
        super(name);
        this.salary = salary;
        this.year = year;
        this.ssn = ssn;
    }

    public Employee(String name, double salary, int year) {
        super(name);
        this.salary = salary;
        this.year = year;
        this.ssn = "";
    }

    public Employee(String name, double salary) {
        super(name);
        this.salary = salary;
        this.year = 0;
        this.ssn = "";
    }

    public Employee(String name) {
        super(name);
        this.salary = 0;
        this.year = 0;
        this.ssn = "";
    }

    public Employee() {
        super();
        this.salary = 0;
        this.year = 0;
        this.ssn = "";
    }

    public double getSalary() {
        return this.salary;
    }

    public int getYear() {
        return this.year;
    }

    public String getSsn() {
        return this.ssn;
    }

    @Override
    public boolean equals(Object otherEmployee) {
        if (otherEmployee instanceof Employee) {
            Employee employee = (Employee) otherEmployee;
            return this.ssn.equals(employee.getSsn());
        }
        return false;
    }
}
