package Recursion;

import java.util.Scanner;

public class ReverseAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
//        rev(arr,0,n - 1);
        rev(arr,0);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
//    public static void rev(int[] arr, int i,int n) { //usin two varailbes
//
//        if(i==n)
//        {
//            return;
//        }
//        int temp = arr[i];
//        arr[i] = arr[n];
//        arr[n] = temp;
//        rev(arr,i+1,n - 1);
//    }
    private static void rev(int[] arr,int s) { //using one varible
        if(s == arr.length /2) {
            return;
        }
        int temp = arr[s];
        arr[s] = arr[arr.length- 1 - s];
        arr[arr.length - 1 - s] = temp;
       rev(arr,s + 1);
    }
}
