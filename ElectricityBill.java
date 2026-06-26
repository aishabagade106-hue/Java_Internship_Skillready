
import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter units cnsumed:");
        int units = sc.nextInt();
        double bill = units * 30;
        System.out.println("Bill="+ bill);
    }
    
}
