package Pattern;
/* 666666
55555
4444
333
22
1 */
import java.util.Scanner;


public class InvertedNumberPattern {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int row =1;
        int no =n;

        while (row<= n) {
            int col = 1;
            while (col<= n-row+1) {
                System.out.print(no);
                col = col +1;
            }
            System.out.println();
            row = row +1;
            no= no-1;
        }
    }
}
