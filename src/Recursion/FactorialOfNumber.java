package Recursion;

import java.util.Scanner;

public class FactorialOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fact= facto(n);
        System.out.println(fact);
    }
    public static int facto(int n) {
        if(n == 0 )
        {
            return 1;
        }
        return n * facto(n-1);
    }

}
