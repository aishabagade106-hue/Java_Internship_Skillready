
import java.util.Scanner;

public class EventRegistrationValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        boolean feePaid = sc.nextBoolean();
        boolean registration =(age >= 18) && feePaid;
        System.out.println("Registration Successful =" + registration);
    }
}
