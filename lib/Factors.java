package lib;
import java.util.Scanner;
public class Factors {
    /*Write a program to print all the factors of a number other than 1 and the number itself. */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number, i, factor; 
        number= sc.nextInt();
        
        for ( i=2; i < number; i++) {
            if (number%i==0) {
                System.out.print(i+ " ");
                
            }
            
        }
        
        
    }

}
