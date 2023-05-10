import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            Employee employee1 = new Employee("John", 100000, 2020, "123-45-6789");

            Employee employee2 = new Employee("Sarah", 107000, 2019, "312-45-6789");

            System.out.println("Please enter an employee number: \n1. John\n2. Sarah");
            int num = scanner.nextInt();

            if (num == 1) {
                System.out.print(
                        employee1.getName() + " $" + employee1.getSalary() + " Year: " + employee1.getYear() + " SSN: "
                                + employee1.getSsn());
            } else if (num == 2) {
                System.out
                        .println(employee2.getName() + " " + "$" + employee2.getSalary() + " Year: "
                                + employee2.getYear()
                                + " SSN: "
                                + employee2.getSsn());
            } else {
                System.out.println("Invalid input");
            }
        }
    }
}
