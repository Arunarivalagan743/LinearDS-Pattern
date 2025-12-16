package Recursion;
//33. Search in Rotated Sorted Array
//        Solved
//Medium
//        Topics
//premium lock iconCompanies
//
//There is an integer array nums sorted in ascending order (with distinct values).
//
//Prior to being passed to your function, nums is possibly left rotated at an unknown index k (
// 1 <= k < nums.length) such that the resulting array is
// [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed).
// For example, [0,1,2,4,5,6,7] might be left rotated by 3 indices and become [4,5,6,7,0,1,2].
//
//Given the array nums after the possible rotation
// and an integer target, return the index of target
// if it is in nums, or -1 if it is not in nums.
//
//You must write an algorithm with O(log n) runtime complexity.
//
//
//
//Example 1:
//
//Input: nums = [4,5,6,7,0,1,2], target = 0
//Output: 4
//
//Example 2:
//
//Input: nums = [4,5,6,7,0,1,2], target = 3
//Output: -1
//
//Example 3:
//
//Input: nums = [1], target = 0
//Output: -1

class Solution {
    public int search(int[] nums, int target) {
        return   bin(nums,target,0,nums.length -1);
    }
    public static int bin(int a[],int t,int l,int r)
    {
        if(l>r)
        {
            return -1;
        }
        int m  =  l  + (r - l) /2;
        if(a[m] ==  t)
        {
            return m;
        }
        if(a[m] >= a[l])
        {
            if(t >= a[l] && t <= a[m])
            {
                return bin(a,t,l,m -1);
            }
            else{
                return bin(a,t,m +  1,r);
            }

        }
        else{
            if(t >= a[m] && t <= a[r])
            {
                return bin(a,t,m+1,r);
            }
            else{
                return bin(a,t,l,m - 1);
            }
        }
    }
}