import java.util.Scanner;

public class CricketStrikeRateCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Runs:");
        int runs = sc.nextInt();
        System.out.print("Enter Balls :");
        int balls = sc.nextInt();
        double strikeRate = (runs * 100.0) / balls;
        System.out.println("Strike Rate = " + strikeRate);
    }
}
