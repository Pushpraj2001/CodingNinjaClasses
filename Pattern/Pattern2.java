package Pattern;

import java.util.Scanner;
/*1 1 1 1 1 1 
2 2 2 2 2 2 
3 3 3 3 3 3 
4 4 4 4 4 4 
5 5 5 5 5 5 
6 6 6 6 6 6*/

public class Pattern2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int row = 1;
        while (row <= n) {
            int col = 1;
            while (col <= n) {
                System.out.print(row +" ");
                col = col+1;

            }
            System.out.println();
        row = row + 1;
        }
    }
}
