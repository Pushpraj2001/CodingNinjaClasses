package Pattern;
import java.util.Scanner;

/*
1=1
1+2=3
1+2+3=6
*/
public class SumPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 1;
        int row = 1;
        

        while (row <= n) {
            System.out.print(row + '=' + sum);
            while (row>1) {
                System.out.print('+' );
                System.out.println(row);
                row = row+1;
            }
        }
    }
}
