package TwoPointer;

import java.util.Scanner;

//Given an array of integers arr[], move all the zero
//s to the end of the array while maintaining the relative order of all non-zero
//elements.
//
//Examples:
//
//Input: arr[] = [1, 2, 0, 4, 3, 0, 5, 0]
//Output: [1, 2, 4, 3, 5, 0, 0, 0]
//Explanation: There are three 0s that are moved to the end.


public class MoveAllZerosToEndOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        moveZeros(arr);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    private static void moveZeros(int[] arr) {
        int i  =0;
        int j = i+1;
        while (j < arr.length) {
            if(arr[i] != 0 && arr[j] !=0)
            {
                i++;
                j++;
            }
            else if(arr[i] == 0 && arr[j] == 0)
            {
                j++;
            }
            else if(arr[i] == 0 && arr[j] != 0)
            {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j++;
            }
            else{
                i++;
                j++;
            }
        }
    }
}
