package Pattern;

import java.util.Scanner;
/* *****
**** 
***  
**   
*  */
public class Pattern9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row= 1;
        while (row<=n) {
            int col = 1;
            while (col<=n-row+1) {
                System.out.print('*');
                col = col+1;
            }
            System.out.println();
            row = row +1;
        }
    }
}
