
import java.util.Scanner;

public class OnlineShoppingBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Product name:");
        String product = sc.nextLine();
        System.out.print("Enter Price:");
        double price = sc.nextDouble();
        System.out.print("Enter Quantity:");
        int Quantity = sc.nextInt();
        double totalAmount = price * Quantity;
        System.out.println("Product ="+ product);
        System.out.println("Total Amount ="+ totalAmount);
    }
    
}
