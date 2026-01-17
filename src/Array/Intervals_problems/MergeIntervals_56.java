package Array.Intervals_problems;

/*
 * LeetCode 56 - Merge Intervals
 * Link: https://leetcode.com/problems/merge-intervals/
 *
 * Given an array of intervals where intervals[i] = [start, end],
 * merge all overlapping intervals and return an array of the non-overlapping intervals.
 *
 * Time Complexity: O(n log n)
 * Space Complexity: O(n)
 */

import java.util.*;

public class MergeIntervals_56 {

    public int[][] merge(int[][] intervals) {

        // Base case
        if (intervals.length <= 1) {
            return intervals;
        }

        // Sort intervals by start time
        Arrays.sort(intervals, Comparator.comparingInt(i -> i[0]));

        // List to store merged intervals
        ArrayList<int[]> merged = new ArrayList<>();

        // Start with the first interval
        int[] newInt = intervals[0];
        merged.add(newInt);

        // Merge intervals
        for (int[] i : intervals) {
            if (i[0] <= newInt[1]) {
                // Overlapping interval → merge
                newInt[1] = Math.max(newInt[1], i[1]);
            } else {
                // Non-overlapping interval → add new
                newInt = i;
                merged.add(newInt);
            }
        }

        // Convert ArrayList to 2D array
        return merged.toArray(new int[merged.size()][]);
    }
}
