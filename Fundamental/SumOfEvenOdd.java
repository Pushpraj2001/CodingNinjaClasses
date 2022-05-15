package lib;

import java.util.Scanner;

public class SumOfEvenOdd {
    public static void main(String[] args) {

        /*
         * Write a program to input an integer N and print the sum of all its even
         * digits and sum of all its odd digits separately.
         * Digits mean numbers, not the places! That is, if the given integer is
         * "13245", even digits are 2 & 4 and odd digits are 1, 3 & 5.
         * Input format :
         */
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int Digit;
        int even = 0, odd = 0;

        while (number > 0) {
            Digit = number % 10;
            number = number / 10;
            if (Digit % 2 != 0) {
                odd = odd + Digit;
            } else {
                even = even + Digit;
            }
        }
        System.out.println(even + " " + odd);
    }
}
