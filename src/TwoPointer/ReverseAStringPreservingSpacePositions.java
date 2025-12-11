package TwoPointer;

import java.util.Scanner;

//557. Reverse Words in a String III
//Solved
//        Easy
//Topics
//premium lock iconCompanies
//
//Given a string s, reverse the order of characters in each word
// within a sentence while still preserving whitespace and initial word order.
//
//
//
//        Example 1:
//
//Input: s = "Let's take LeetCode contest"
//Output: "s'teL ekat edoCteeL tsetnoc"

public class ReverseAStringPreservingSpacePositions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        int i =0;
        int j =1;

        while (j<s.length()){
            if(s.charAt(j) == ' ')
            {
                sb.append(rev(s,i,j - 1));
                sb.append(' ');
                i = j+1;
            }
            j++;
        }
        if(i<s.length())
            sb.append(rev(s,i,s.length() - 1));
        System.out.println(sb.toString());


    }
    public static String rev(String s,int i,int j){
        StringBuilder sb = new StringBuilder();
        while(j>=i)
        {
         sb.append(s.charAt(j));
         j--;
        }
        return sb.toString();
    }
}
