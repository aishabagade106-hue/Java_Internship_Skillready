import java.util.Scanner;

public class MobileRechrgeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Recharge amount:");
        double amount = sc.nextDouble();
        double gst = amount * 0.18;
        double finalAmount = amount+gst;
        System.out.println("GST ="+gst);
        System.out.println("Final Amount ="+ finalAmount);
    }
}


        