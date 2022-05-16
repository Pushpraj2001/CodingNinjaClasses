package Pattern;

import java.util.Scanner;
/*A
AB
ABC
ABCD*/

public class AlphaPattern {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int row = 1;
        while (row <= n) {
            int col = 1;
            while (col <= n) {

                char jthChar = (char) ('A' + (row - 1));
                System.out.print(jthChar);
                col = col + 1;
            }
            System.out.println();
            row = row + 1;
        }
    }
}
