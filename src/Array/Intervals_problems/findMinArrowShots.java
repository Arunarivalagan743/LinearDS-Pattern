package Array.Intervals_problems;

/*
 LeetCode 452: Minimum Number of Arrows to Burst Balloons

 Problem:
 Each balloon is an interval [start, end]
 One arrow can burst all balloons that overlap at a point
 Find minimum arrows needed

 Approach: Greedy

 Idea:
 - Sort intervals by end time
 - Shoot arrow at earliest end
 - If next balloon starts after current end → need new arrow

 Time Complexity: O(N log N)
 Space Complexity: O(1)
*/

import java.util.Arrays;

class findMinArrowShot{
    public int findMinArrowShots(int[][] points) {

        // Edge case
        if (points.length == 0) return 0;

        // Sort balloons by end coordinate
        Arrays.sort(points, (a, b) -> Integer.compare(a[1], b[1]));

        int arrows = 1;             // At least one arrow needed
        long end = points[0][1];    // Position of current arrow

        for (int i = 1; i < points.length; i++) {

            // If balloon does not overlap
            if (points[i][0] > end) {
                arrows++;           // Need new arrow
                end = points[i][1];
            }
        }

        return arrows;
    }
}
