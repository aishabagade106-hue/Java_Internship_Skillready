package Operator;
//it is used for combined multiple conditions
// &&==> LOGICAL AND ||==> LOGICAL OR !==>NOT
public class LogicalOP {
    public static void main(String[] args) {
        int age=25;
        boolean citizen=false;
        //System.out.println("LOGICAL and =");
        //System.out.println(age=>18 || citizen);
        System.err.println("LOGICAL or =");
        System.out.println("age>=18 || citizen");
    }
}
//LOGICAL AND
//A B A && B
//T T T
//T F F
//F T F
//F F F
//what is the diff betw && and ||?
//LOGICAL OR
//A B A || B
//T T T
//T F T
//F T T
//F F F