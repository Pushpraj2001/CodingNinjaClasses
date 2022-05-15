package Fundamental;

import java.util.Scanner;



public class CharacterCase {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        char n = s.next().charAt(0);
        int a = n;
        if (a>= 65 && a<=90 ) {
            // this is for A-Z
            System.out.println("1");
        } else if(a>=97 && a<=122) {
            // this is for a-z
            System.out.println("0");
        }else{
            // this is for not a alphabets
            System.out.println("-1");
        }
    }
}
