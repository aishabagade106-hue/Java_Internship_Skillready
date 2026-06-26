
import java.util.Scanner;

public class CompleteStudentAdmissionForm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student Name:");
        String StudentName = sc.nextLine();
        System.out.print("Enter Father's Name:");
        String fatherName = sc.nextLine();
        System.out.print("Enter age:");
        int age = sc.nextInt();
        System.out.print("Enter Percentage:");
        double Percentage = sc.nextDouble();
        sc.nextLine();
        System.out.print("Enter Course Name:");
        String course = sc.nextLine();
        System.out.print("Enter Mobile Number:");
        String mobile = sc.nextLine();
        System.out.print("Enter City:");
        String city = sc.nextLine();
        System.out.println("\n------------------------------------");
        System.out.println("ADMISSION FORM");
        System.out.println("------------------------------------------");
        System.out.println("Student Name:"+ StudentName);
        System.out.println("Father Name:"+ fatherName);
        System.out.println("Age:"+ age);
        System.out.println("Percentage:"+ Percentage);
        System.out.println("Course:"+ course);
        System.out.println("Mobile:"+ mobile);
        System.out.println("City:"+ city);
        System.out.println("-----------------------------------------------");
        System.out.println("Admission Successful");
        System.out.println("-------------------------------------------------");
    }
    
}
