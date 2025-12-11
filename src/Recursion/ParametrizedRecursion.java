package Recursion;

public class ParametrizedRecursion {
    public static void main(String[] args) {
        int n  = 3;
        int sum  =0;
        int ans = sum(n);
        System.out.println(ans);
    }
    public static int sum(int n) {
        if(n < 0)
        {
            return 0;
        }
        return n + sum(n - 1);
    }
}
