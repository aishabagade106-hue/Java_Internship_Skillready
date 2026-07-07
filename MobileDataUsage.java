
import java.util.Scanner;

public class MobileDataUsage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalData = sc.nextInt();
        int usedData = sc.nextInt();
        int remainingData = totalData - usedData;
        System.out.println("Remaining Data =" + remainingData + "GB");
    }
    
}
