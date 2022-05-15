package lib;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the no");
        int a,b;
        a = s.nextInt();
     

        if (a%2 == 0) {
            System.out.println(a+ " Entered Number is Even");
        } else {
            System.out.println(a +" Entered Number is Odd");
        }
        
        
    }
}
