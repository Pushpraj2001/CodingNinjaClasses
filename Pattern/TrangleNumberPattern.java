package Pattern;

import java.util.Scanner;
/*1
22
333
4444*/

public class TrangleNumberPattern {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int row = 1;
      
        while (row <= n) {
         
            int col = 1;
            while (col <= row) {
                char jthChar = (char) ('A' + (row - 1));
                System.out.print(jthChar);

                col = col + 1;
                // p = p + 1;
            }
            System.out.println();
            row = row + 1;
        }
    }
}
