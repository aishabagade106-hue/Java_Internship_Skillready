
import java.util.Scanner;


public class Waterconsumptiontracker {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
     // input water intake
        double morning = sc.nextDouble();
        double afternoon = sc.nextDouble();
        double evening = sc.nextDouble();
     // calculate total water consumed
        double total = morning + afternoon + evening;
     //display result
         System.out.println("Total water consumed ="+ total +"Liters");
         sc.close();
    }
}
          
