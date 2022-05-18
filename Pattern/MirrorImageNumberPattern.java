package Pattern;

import java.util.Scanner;

public class MirrorImageNumberPattern {
    /*   1
    12
   123
  1234
 12345
123456 */
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
     
        int n = sc.nextInt();
        int row = 1;
        while (row<=n) {
            
            int spaces =1;
            while (spaces<=n-row) {
                System.out.print(' ');
                spaces = spaces+1;

            }
        int stars =1;
        while (stars<=row) {
            System.out.print(stars);
            stars = stars +1;

        }
        System.out.println();
        row = row+1;  
    }
    }
}
