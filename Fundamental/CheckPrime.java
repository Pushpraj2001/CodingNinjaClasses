package lib;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class CheckPrime{
public static void main(String[] args) {
 
    Scanner sc= new Scanner(System.in);
    int n;  
    n = sc.nextInt();
    int div = 2;
    // boolean isPrime = true;
    while (div<=n-1) {
        if (n % div ==0) {
            System.out.println("Composite Number");
            // isPrime = false;
            return;
        } 
        div = div +1;
    }
   
        System.out.println("Prime");
    
}
}