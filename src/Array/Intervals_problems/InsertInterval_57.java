package Array.Intervals_problems;
/*
 * LeetCode 57 - Insert Interval
 * Link: https://leetcode.com/problems/insert-interval/
 *
 * Given an array of non-overlapping intervals sorted by start time,
 * insert a new interval and merge if necessary.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

import java.util.*;

public class InsertInterval_57 {

    public int[][] insert(int[][] intervals, int[] newInterval) {

        ArrayList<int[]> res = new ArrayList<>();
        int n = intervals.length;
        int j = 0;

        // 1️⃣ Add all intervals that end before newInterval starts
        while (j < n && intervals[j][1] < newInterval[0]) {
            res.add(intervals[j]);
            j++;
        }

        // 2️⃣ Merge overlapping intervals with newInterval
        while (j < n && intervals[j][0] <= newInterval[1]) {
            newInterval[0] = Math.min(intervals[j][0], newInterval[0]);
            newInterval[1] = Math.max(intervals[j][1], newInterval[1]);
            j++;
        }

        // Add the merged interval
        res.add(newInterval);

        // 3️⃣ Add remaining intervals
        while (j < n) {
            res.add(intervals[j]);
            j++;
        }

        // Convert ArrayList to 2D array
        return res.toArray(new int[res.size()][2]);
    }
}
