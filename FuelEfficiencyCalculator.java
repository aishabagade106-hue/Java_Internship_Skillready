import java.util.Scanner;

public class FuelEfficiencyCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int distance = sc.nextInt();
        int fuelUsed = sc.nextInt();
        int FuelEfficiency = distance / fuelUsed;
        System.err.println("Fuel Efficiency =" + FuelEfficiency + "Km / 1");
    }
    
}
