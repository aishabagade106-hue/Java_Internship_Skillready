
import java.util.Scanner;

public class Bookreadingprogress {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalPages = sc.nextInt();
        int pagesRead= sc.nextInt();
        int remainingPages = totalPages - pagesRead;
         System.out.println("Remaining Pages ="+ remainingPages);
         sc.close();
    }
}
        