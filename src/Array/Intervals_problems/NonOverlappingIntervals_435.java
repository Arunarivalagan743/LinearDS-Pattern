package Array.Intervals_problems;

/*
 * LeetCode 435 - Non-overlapping Intervals
 * Link: https://leetcode.com/problems/non-overlapping-intervals/
 *
 * Time Complexity: O(n log n)
 * Space Complexity: O(1)
 */

import java.util.*;

public class NonOverlappingIntervals_435 {

    public int eraseOverlapIntervals(int[][] intervals) {

        if (intervals.length == 0) return 0;

        // Sort intervals by end time
        Arrays.sort(intervals, Comparator.comparingInt(i -> i[1]));

        int count = 1;                 // number of non-overlapping intervals
        int lastEnd = intervals[0][1];

        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] >= lastEnd) {
                count++;
                lastEnd = intervals[i][1];
            }
        }

        // intervals to remove
        return intervals.length - count;
    }
}
