package OperatorsAndloop;

public class BreakKeyword {
    public static void main(String[] args) {
        int n=5;
        int i =1;
        while (i<=n) {
            if (i ==4) {
                break;
            }
           
            System.out.println(i);
            i++;
        }
        System.out.println("Outside While");
    }
}
