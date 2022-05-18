package Pattern;

import java.util.Scanner;
/*     1
    *
   ***
  *****
 *******
*********  */
public class Pattern11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row= 1;
        while (row<=n) {
            int spaces = 1;
            while (spaces<=n-row) {
                System.out.print(' ');
                spaces = spaces+1;
            }
            int star = 1;
            while (star<=row) {
                System.out.print('*');
                star = star +1;
            }
            int dec = row-1;
             while (dec>=1) {
                 System.out.print("*");
                 dec = dec -1;
             }   
            System.out.println();
            row = row +1;
        }
    }
}
