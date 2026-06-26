
import java.util.Scanner;

public class MovieTicketBooking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String customerName = sc.nextLine();
        int tickets = sc.nextInt();
        int totalAmount = tickets * 250;
        System.out.println("Customer Name : "+customerName);
        System.out.println("Tickets :"+tickets);
        System.out.println("Total Amount = "+totalAmount);
        sc.close();
    }
    
}
