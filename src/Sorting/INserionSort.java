package Sorting;

import java.util.Scanner;

public class INserionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        insertion(arr);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void insertion(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            for(int j  =  i+1;j>=0;j--)
            {
                if(a[j] < a[j - 1])
                {
                    int temp = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = temp;
                }
                else{
                    break;
                }
            }
        }
    }
}
