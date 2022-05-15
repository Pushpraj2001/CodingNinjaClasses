package lib;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int i = 1;
        int n = s.nextInt();
    /*    while (i<=n) {
            System.out.println("Hello");
            i=i+1;
        }*/
        while (i<=n) {
            System.out.println(i);
            i=i+1;
        }
    }
}
