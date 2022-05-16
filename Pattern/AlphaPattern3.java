package Pattern;

import java.util.Scanner;
/*ABCDEF
BCDEFG
CDEFGH
DEFGHI
EFGHIJ
FGHIJK*/

public class AlphaPattern3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int row = 1;
        while (row <= n) {
            int col = 1;
            char p = (char) ('A' + row - 1);
            while (col <= row) {

                System.out.print(p);
                p = (char) (p+1);
                col = col + 1;

            }
            System.out.println();
            row = row + 1;
        }
    }
}
