package Sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int a[] = {5,4,3,2,1};
        mergeSort(a,0,a.length);
        System.out.println(Arrays.toString(a));
    }
    public static void mergeSort(int a[], int low, int high) {
        if(high - low == 1)
        {
            return;
        }
        int mid = (low + high)/2;
        mergeSort(a,low,mid);
        mergeSort(a,mid,high);
        merge(a,low,mid,high);
    }
    static void merge(int a[],int l,int m,int e)
    {
        int mix[] = new int[e-l];
        int i =l;
        int j  = m;
        int k  =0;
        while(i<m && j<e)
        {
            if(a[i]<a[j])
            {
                mix[k]= a[i];
                i++;
                k++;
            }
            else{
                mix[k]= a[j];
                j++;
                k++;
            }
        }
        while(i<m)
        {
            mix[k]= a[i];
            i++;
            k++;
        }
        while(j<e)
        {
            mix[k]= a[j];
            j++;
            k++;
        }
        for (int n = 0; n < mix.length; n++) {
            a[l+ n] = mix[n];

        }
    }
}
