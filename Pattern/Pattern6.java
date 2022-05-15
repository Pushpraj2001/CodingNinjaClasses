package Pattern;

import java.util.Scanner;

/*1
12
123
1234
12345*/
public class Pattern6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int row = 1;
        int p = 1;
        while (row <= n) {
            int col = 1;
            while (col <= row) {
                System.out.print(p);
                p = p + 1;
                col = col + 1;

            }
            System.out.println();
            row = row + 1;
        }
    }
}
