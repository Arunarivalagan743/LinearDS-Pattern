package Recursion;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        boolean b  = palin(s,0);
        System.out.println(b);
    }
    public static boolean palin(String s, int i) {
        if(i == s.length()) {
            return true;
        }
        if(s.charAt(i) != s.charAt(s.length() - 1- i))
        {
            return false;
        }
        palin(s,i+1);
        return true;
    }
}
