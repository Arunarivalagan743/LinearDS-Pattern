package Subset;

import java.util.ArrayList;

public class PhonePad {


    public static void main(String[] args) {
        String s ="23";
        ArrayList <String>  al = pad("",s);
        System.out.println(al);
    }

    static ArrayList<String> pad(String p,String up)
    {
        String m[] = {
        "","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"
    };
        if(up.isEmpty())
        {
            ArrayList<String>  al = new ArrayList<>();
            al.add(p);
            return al;
        }
        ArrayList<String>  list = new ArrayList<>();
        int d = up.charAt(0)-'0';
        String  l  = m[d];
        for (char c  :  l.toCharArray()) {
            list.addAll(pad(p+c, up.substring(1)));

        }
        return list;

    }
}
