
import java.util.Scanner;

public class PizzaBillGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int quantity = sc.nextInt();
        int totalBill = quantity * 199;
        System.out.println("Total Bill: "+ totalBill);
        sc.close();
    }
}
