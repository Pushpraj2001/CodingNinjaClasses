package lib;
import java.util.Scanner;
// Write a program to print multiplication table of n
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no ;
        no= sc.nextInt();
        int i=1;
        int table;
        while (i<=10) {
           table = no * i;
           i = i+1;
           System.out.println(table);
        }
    }
}
