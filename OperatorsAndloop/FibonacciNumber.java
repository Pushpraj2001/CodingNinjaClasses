package OperatorsAndloop;

import java.util.Scanner;

public class FibonacciNumber {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int b= 1;
        int c;
        for (int i = 0; i < n; i++) {
            c= a+b;//1,2
            a=b;//1,1
            b=c;//1,2

        }
        System.out.println(a);
    }

}
