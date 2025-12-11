package TwoPointer;

import java.util.Scanner;

//
//
//Remove duplicates from Sorted Array
//
//Given a sorted array arr[] of size n, the goal is to rearrange the array so
//that all distinct elements appear at the beginning in sorted order.
//        Additionally, return the length of this distinct sorted subarray.
//
//        Note: The elements after the distinct ones can be in any order and
//        hold any value, as they don't affect the result.
//
//Examples:
//
//Input: arr[] = [2, 2, 2, 2, 2]
//Output: [2]
//Explanation: All the elements are 2, So only keep one instance of 2.
//
//Input: arr[] = [1, 2, 2, 3, 4, 4, 4, 5, 5]
//Output: [1, 2, 3, 4, 5]


public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
           int k =  removeDup(arr);
            for (int i = 0; i <k; i++) {
                System.out.print(arr[i] + " ");
            }
    }
    public static int removeDup(int[] a) {
        int j  =1;
        for (int i = 1; i < a.length; i++) {
            if(a[i]!=a[i-1])
            {
                a[j++] = a[i];
            }
        }
        return j;
    }
}
