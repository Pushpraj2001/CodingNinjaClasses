package Pattern;
import java.util.Scanner;
/* 
*1*
*121*
*12321*
*1234321*
*123454321*
*12345654321*
*123454321*
*1234321*
*12321*
*121*
*1*
*
*/
public class HalfDiamondPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row, col;
        for (row = 1; row<=n; row++){
            System.out.print('*');
            for (col=1; col<=row; col++) {
                System.out.print(col);
               
            }
            for (col = row-1; col>=1; col--) {
                System.out.print(col);
                
            }
            System.out.println('*');
           
        } 
        // for lower part
        for (row = n-1; row>=1; row--){
            System.out.print('*');
            for (col =1; col<=row; col++){
                System.out.print(col);
                
         }
         for (col = row-1; col>=1; col--){
             System.out.print(col);
            
         }
         System.out.print('*');
         System.out.println();
        }
        System.out.print('*');
    }
}
