package Pattern;

import java.util.Scanner;
/*1 2 3 4 5 6 
1 2 3 4 5 6
1 2 3 4 5 6
1 2 3 4 5 6
1 2 3 4 5 6
1 2 3 4 5 6*/

public class Pattern3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int row = 1;
        while (row <= n) {
            int col = 1;
            while (col <= n) {
                System.out.print(col +" ");
                col = col+1;

            }
            System.out.println();
        row = row + 1;
        }
    }
}
