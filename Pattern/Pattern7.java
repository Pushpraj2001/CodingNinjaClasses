package Pattern;

import java.util.Scanner;

/*1   
23  
345 
4567*/
public class Pattern7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int row = 1;
      
        while (row <= n) {
            int p= row;
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
