package Recursion;

public class LinearSearch {
    public static void main(String[] args) {
        int a[] ={1,2,3,4,5,6,6,53,53,23};
        int k  = 53;
        int i  = 0;
        int ans = linear(a,k,i);
        System.out.println(ans);

    }
    public static  int linear(int a[],int k,int i){
        if(i == a.length){
            return -1;
        }
        if(a[i] == k)
        {
            return i;
        }
        return linear(a,k,i+1);
    }
}
