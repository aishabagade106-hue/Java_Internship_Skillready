
import java.util.Scanner;

public class ClassroomChairArrangement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int students = sc.nextInt();
        int chairs = sc.nextInt();
        boolean enoughChairs = chairs >=  students;
        System.out.println("Enough Chairs Available =" + enoughChairs);
    }
    
}
