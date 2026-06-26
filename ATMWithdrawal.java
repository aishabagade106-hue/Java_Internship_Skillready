
import java.util.Scanner;

public class ATMWithdrawal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance = 10000;
        System.out.print("Enter Withdrawal Amount:");
        double withdrawalAmount = sc.nextDouble();
        double remainingBalance = balance - withdrawalAmount;
        System.out.println("Remaining Balance = " + remainingBalance);
    }
}
