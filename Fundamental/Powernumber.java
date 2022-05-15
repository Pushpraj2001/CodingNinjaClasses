package lib;
import java.util.Scanner;
/*Write a program to find x to the power n (i.e. x^n). Take x and n from the user. You need to print the answer.
Note : For this question, you can assume that 0 raised to the power of 0 is 1 */
public class Powernumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), x = sc.nextInt();
        int total =1;
       for (int i = 1; i <=x; i++) {
           total = total*n;
       }
       System.out.println(total);
    }
}
