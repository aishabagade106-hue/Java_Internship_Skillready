
import java.util.Scanner;

public class student_registration {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.err.println("====STUDENT REGISTRATION FOR====");
        System.out.println("Enter students name:");
        String name = s1.nextLine();
        System.out.println("Enter student age:");
        int age =  s1.nextInt();
        System.err.println("enter 12th percentage:");
        double percentage =s1.nextDouble();
        System.err.println("Enter grade:");
        char grade =s1.next().charAt(0);
        System.err.println("====STUDENT REGISTRATION SUCCESSFUL====");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("12th Percentage: " + percentage);
        System.out.println("Grade: " + grade);
    }
}
