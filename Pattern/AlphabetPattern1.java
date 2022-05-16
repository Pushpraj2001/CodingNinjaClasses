package Pattern;

import java.util.Scanner;
/*ABCD
ABCD
ABCD
ABCD*/

public class AlphabetPattern1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int row = 1;
        while (row <= n) {
            int col = 1;
            while (col <= n) {
                char jthChar =(char) ('A'+ col-1);
                System.out.print(jthChar);
                col = col+1;

            }
            System.out.println();
        row = row + 1;
        }
    }
}
