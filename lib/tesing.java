package lib;

import java.util.Scanner;

public class tesing {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int i=10;
    while((i=i-1)>0)
    {
        System.out.print(i);
        if(i%5==0)
            return;
    }
}
}
