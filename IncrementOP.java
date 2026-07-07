package Operator;

public class IncrementOP {
    public static void main(String[] args) {
        //System.out.println("hello increment operator");
        // ++==> increment --==>decrement    
        int a=10;
        a++;
        int b=0;
        b--;
        System.out.println("value of b="+b);
        System.out.println("value of a="+a);
        System.out.println("a++ + a++");//23
        //a=11 11++ + 12++
        //a++ post increment ++a pre increment
        System.out.println("value of a ="+a);
        System.out.println("a++ - ++a + --a");
        //-1++ + ++(-1) + (-1)--
        //current value b=-1
        //b++ ==> (-1)++ =0
        //++b ==> ++0 ==>1
        //b-- ==> 1-- ==>0 -1++ +1+ 1==>1
         
        //increment operator 
        //pre increment ++a
        //post increment a++

        //decrement operator 
        //pre decrement --a
        //post decrement a--
    }
}
