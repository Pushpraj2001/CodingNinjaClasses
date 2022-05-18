package Pattern;

import java.util.Scanner;
/*E    
DE   
CDE  
BCDE 
ABCDE*/

public class AlphaPattern4 { 
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        int i = 1;
       int num = n ;
        while(i <= n ){
            
            int  j = 1 ;
            int   Start =  'A'+num-1;    
            while( j<=i ){
            System.out.print((char)(Start));
                j++;
                Start++;
            }
            System.out.println();
           num--;
            i++;
        }
    }
}
