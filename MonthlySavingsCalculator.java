
import java.util.Scanner;

public class MonthlySavingsCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int savings =5000;
        int additionalSavings = sc.nextInt();
        savings += additionalSavings;
        System.out.println("Total Savings =" + savings);
    }
    
}
