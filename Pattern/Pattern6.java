package Pattern;

import java.util.Scanner;

/*1
23
456
78910*/
public class Pattern6 {
    public static void main(String[] args) {
        try (Scanner scd = new Scanner(System.in)) {
            int n = scd.nextInt();
            int row = 1;
            int p = 1;
            while (row <= n) {
                int col = 1;
                while (col <= row) {
                    System.out.print(p);

                    col = col + 1;
                    p = p + 1;
                }
                System.out.println();
                row = row + 1;
            }
        }
    }
}
