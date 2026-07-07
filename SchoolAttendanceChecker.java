
import java.util.Scanner;

public class SchoolAttendanceChecker {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int attendance = sc.nextInt();
        boolean eligible = attendance >= 75;
        System.out.println("Eligible for Exam =" + eligible);
    }
    
}
