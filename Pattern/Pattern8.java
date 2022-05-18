package Pattern;

import java.lang.Thread.State;
import java.util.Scanner;

public class  Pattern8 {
    /*     *                                                                             'C:\Users\pkpr
    **                                                                             t.java\jdt_ws\
   ***
  ****
 *****                                                                             va\jdk-18.0.1.
******   */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        while (row<=n) {
            
            int spaces =1;
            while (spaces<=n-row) {
                System.out.print(' ');
                spaces = spaces+1;

            }
        int stars =1;
        while (stars<=row) {
            System.out.print('*');
            stars = stars +1;

        }
        System.out.println();
        row = row+1;  
    }

    }
}
