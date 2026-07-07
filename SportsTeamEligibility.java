import java.util.Scanner;

public class SportsTeamEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        int height = sc.nextInt();
        boolean eligible = (age <= 18) && (height >= 160);
        System.out.println("Eligible =" + eligible);

    }
    
}
