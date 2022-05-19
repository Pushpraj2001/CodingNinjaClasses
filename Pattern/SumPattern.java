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
        // int sum = 1;
        int row = 1;
        

        while (row <= n) {
            int j = 1;
            int sum = 0;
            // System.out.print(row + '=' + sum);
//             loop condition should be j<=row, your condtion was row>1
            while (j <= row) {
                
//                 System.out.print('+' );
//                 System.out.println(row);
//                 row = row+1;
                sum = sum + j;
                System.out.print(j);
                j++;
                if(j <= row){
                    System.out.print('+');
            	}
            }
            System.out.print('=' + ""+ sum);
            System.out.println();
            row++;
    }
  }
}
