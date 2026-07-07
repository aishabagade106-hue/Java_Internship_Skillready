import java.util.Scanner;

public class OnlineCourseAccess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean subscription = sc.nextBoolean();
        boolean accessCode = sc.nextBoolean();
        boolean accessGranted = subscription || accessCode;
        System.out.println("Access Granted =" + accessGranted);

    }
}
