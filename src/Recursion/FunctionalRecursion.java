package Recursion;

public class FunctionalRecursion {
    public static void main(String[] args) {
        int n = 3;
                int sum  =0;
                sum(n,sum);
    }
    private static void sum(int n, int sum) {
        if(n < 0)
        {
            System.out.println(sum);
            return;
        }
        sum(n -1,sum +n);
    }
}
