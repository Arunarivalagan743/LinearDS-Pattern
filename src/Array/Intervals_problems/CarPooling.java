package Array.Intervals_problems;
//INTERVAL PROBLEMS
//│
//        ├── Greedy (Sort by End)
//│   ├── Min Arrows
//│   └── Non-overlapping Intervals
//│
//        ├── Merge Intervals
//│   ├── Merge Intervals
//│   └── Insert Interval
//│
//        └── Sweep Line / Prefix Sum
//    └── Car Pooling

/*
 LeetCode 1094: Car Pooling

 Problem:
 trips[i] = [numPassengers, from, to]
 Car has fixed capacity.
 Return true if all trips can be completed without exceeding capacity.

 Approach: Difference Array (Prefix Sum)

 Idea:
 - At 'from', passengers get IN
 - At 'to', passengers get OUT
 - Use prefix sum to track passengers at each point
 - If passengers > capacity → return false

 Time Complexity: O(N + 1000)
 Space Complexity: O(1000)
*/

class Solution {
    public boolean carPooling(int[][] trips, int capacity) {

        // Difference array to track passenger changes
        int[] diff = new int[1001];

        // Mark pickup and drop points
        for (int[] trip : trips) {
            diff[trip[1]] += trip[0]; // pickup passengers
            diff[trip[2]] -= trip[0]; // drop passengers
        }

        int current = 0;

        // Prefix sum to track current passengers
        for (int i = 0; i < 1001; i++) {
            current += diff[i];
            if (current > capacity) return false;
        }

        return true;
    }
}
