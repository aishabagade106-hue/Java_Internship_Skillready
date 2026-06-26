
import java.util.Scanner;

public class EmployeeSalaryCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        double Salary = sc.nextDouble();
        double annualSalary = Salary * 12;
        System.out.println("Employee : " + name);
        System.out.println("Anual Salary: " + annualSalary);
    }
}
