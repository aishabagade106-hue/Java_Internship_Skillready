
import java.util.Scanner;

public class MovieTicketRevenue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tickets = sc.nextInt();
        int revenue = tickets  * 250;
        System.out.println("Total Revenue =" + revenue);
    }
    
}
