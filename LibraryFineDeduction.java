import java.util.Scanner;

public class LibraryFineDeduction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance = 100;
        int fine = sc.nextInt();
        balance -= fine;
        System.out.println("Remaning Balance =" + balance);
    }
}
