import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter birth year: ");
        int birthYear = sc.nextInt();
        int currentYear = sc.nextInt();
        int age = currentYear - birthYear;
        System.out.println("age =" + age);
        sc.close();
    }

}
