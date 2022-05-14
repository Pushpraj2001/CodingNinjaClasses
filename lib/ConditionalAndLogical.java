package lib;
import java.util.Scanner;
public class ConditionalAndLogical {
    public static void main(String[] args) {
        
        Scanner s= new Scanner(System.in);
        int a,b;
        a = s.nextInt();
        b = s.nextInt();

        // if (a>0 && b>0) {
        //     System.out.println("Both no is Positive");
        // } else {
        //     System.out.println("any one is Negative");

        // }
            if (a != b) {
                System.out.println("both are not equal!");
            } else {
                System.out.println("Both are equal!");
            }
    }

}
