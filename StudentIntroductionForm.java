
import java.util.Scanner;

public class StudentIntroductionForm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = sc.nextLine();
        System.out.println("Enter your age:");
        int age = sc.nextInt();
        System.out.println("Enter your City:");
        String city = sc.next();
        System.out.println("Student Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("City: " + city);
        sc.close();
    }
}
