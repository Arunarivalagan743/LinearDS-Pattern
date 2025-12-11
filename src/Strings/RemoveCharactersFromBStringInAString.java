package Strings;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveCharactersFromBStringInAString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

            String a = sc.nextLine();
            char ch[] = a.toCharArray();
        ArrayList <Character> list = new ArrayList();
        for (int i = 0; i < ch.length; i++) {
            list.add(ch[i]);
        }
            for (int i = 0; i < s.length(); i++) {
                if(!list.contains(s.charAt(i))){
                    System.out.print(s.charAt(i));
                }
            }
    }
}
