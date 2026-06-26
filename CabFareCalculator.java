
import java.util.Scanner;

public class CabFareCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Distance (km): ");
        double distance = sc.nextDouble();
        double fare = distance * 15;
        System.out.println("Fare = " + fare);
    }
}