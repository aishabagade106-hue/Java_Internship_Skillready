
import java.util.Scanner;

public class CalculateSimpleIntrest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double principal = sc.nextDouble();
        double rate = sc.nextDouble();
        double time = sc.nextDouble(); 
        double CalculateSimpleIntrest = (principal * rate * time)/ 100;
        System.out.println("simple interest ="+ CalculateSimpleIntrest);
    }
    
}
