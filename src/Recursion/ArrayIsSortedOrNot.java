package Recursion;

public class ArrayIsSortedOrNot {
    public static void main(String[] args) {
        int a[] = {1,2,3,5,6,8};
        int i  =0;
        boolean isSorted = sorted(a,i);
        System.out.println(isSorted);
    }
    public static boolean sorted(int[] a,int i) {

        if (i >= a.length - 1 ) {
          return true;
        }
        if(a[i] > a[i+1]) {

            return false;
        }
        return sorted(a,i+1);



    }
}
