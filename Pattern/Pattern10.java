package Pattern;

import java.util.Scanner;
/*     1
   121
  12321
 1234321
123454321  */
public class Pattern10 {
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
            int num = 1;
            while (num<=row) {
                System.out.print(num);
                num = num +1;
            }
            int dec = row-1;
             while (dec>=1) {
                 System.out.print(dec);
                 dec = dec -1;
             }   
            System.out.println();
            row = row +1;
        }
    }
}
