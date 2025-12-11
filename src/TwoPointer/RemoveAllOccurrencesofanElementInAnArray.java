package TwoPointer;

import java.util.Scanner;

//Input: arr[] = [3, 2, 2, 3], ele = 3
//Output: 2
//Explanation: The answer is 2 because there are 2 elements which are not equal to 3 and arr[] will be modified
//such that the first 2 elements contain the elements which are not equal to 3 and
//remaining elements can contain any element. So, modified arr[] = [2, 2, _, _]

public class RemoveAllOccurrencesofanElementInAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        RemoveOccurenceCount(arr,k);
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void RemoveOccurenceCount(int[] arr,int k) {
        int l  =0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=k)
            {
                arr[l]=arr[i];
                l++;
            }
        }
        System.out.println(k);
    }
}
