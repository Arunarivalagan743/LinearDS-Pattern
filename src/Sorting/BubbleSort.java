package Sorting;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        BubbleSort(arr,n);//swap adjacent elemet .It is know as sinking sort , exchange sort
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");  //stable algorthim follow the order
        }
        sc.close(); // time =  best ==> O(n) and in worst in O(n *n)
    }
    public static void BubbleSort(int[] a, int n) {
        for(int i = 0; i < n; i++) {

            boolean swap = false;

            for(int j = 0; j < n - 1 - i; j++) {

                if(a[j] > a[j + 1]) {   // ASCENDING
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;

                    swap = true;
                }
            }

            if(!swap) {
                break;
            }
        }
    }

}
