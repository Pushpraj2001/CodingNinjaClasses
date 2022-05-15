package lib;

import java.util.Scanner;
/*4444
4444
4444
4444*/

public class SquarePattern {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int n = s.nextInt();
            int row = 1;
            while (row <= n) {
                int col = 1;
                while (col <= n) {
                    System.out.print((n-col+1));
                    col = col+1;

                }
                System.out.println();
            row = row + 1;
            }
        }
    }
}
