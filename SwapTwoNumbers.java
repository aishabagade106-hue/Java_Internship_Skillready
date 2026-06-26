
import java.util.Scanner;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Before swap: a = " + a + " " + b);
        // Swapping
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping: a = " + a + " " + b);
        sc.close();
    }

}
