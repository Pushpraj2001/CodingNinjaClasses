package lib;

import java.util.Scanner;

import javax.xml.validation.Schema;

public class SumOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i=1;
        int n;
        n= sc.nextInt();
        int sum=0;

        while (i<=n) {
                 sum= sum+i;
                 i=i+1;
                }
        System.out.println(sum);
    }
}
