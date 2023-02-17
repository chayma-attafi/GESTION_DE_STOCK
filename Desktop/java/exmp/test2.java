
//import java.util.Scanner;
import java.util.*;
public class test2 {
    public static void main (String args[]) {
        Scanner fi = new Scanner(System.in);

        float n1,n2,n3;
        System.out.print("entrer num 1 \t");
        n1=fi.nextFloat();
        System.out.print("entrer num 2 \t");
        n2=fi.nextFloat();   
        System.out.print("entrer num 3 \t");
        n3=fi.nextFloat();
        //System.out.println ("num1 = "+n1+" " +"num2 = "+n2);
        //System.out.printf("num1 = %.2f \t num2 = %.2f %n",n1,n2);
        System.out.printf("avrg = %.3f %n",(n1+n2+n3)/3);

    }
}
