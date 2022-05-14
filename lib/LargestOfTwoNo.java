package lib;

import java.util.Scanner;

public class LargestOfTwoNo {
    public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            int a,b;
            System.out.println("Enter two Number");
            a = s.nextInt();
            b = s.nextInt();
        
            if (a>b) {
                System.out.println(a+" is greter than "+b);
            } if(b>a){
                System.out.println(b+" is greter than "+a);
                }else{
                    System.out.println("Both are equal.");
                    }

        /*
            if (a>b) {
            System.out.println(a+" is greter than "+b);8
            9

        } else {
            if(b>a){
            System.out.println(b+" is greter than "+a);
            }else{
                System.out.println("Both are equal.");
            }
        }*/
    }
}
