public class HouseRobber {
    public int   dpArray(int[] nums) {
        int dp[] = new int[nums.length+1];
        if(nums.length ==1) return nums[0];
        dp[0] =  nums[0];
        dp[1] =  Math.max(nums[1],dp[0]);

        for(int i  = 2;i<nums.length;i++)
        {
            dp[i] =  Math.max(dp[i -2]+nums[i],dp[i-1]);
        }
        return dp[nums.length - 1];
    }

    protected int optiSpace(int[] nums) {
        if(nums.length ==1) return nums[0];
       int p1 = nums[0];
       int p2 =0;

        for(int i  = 1;i<nums.length;i++)
        {
          int c  = Math.max(p1,p2+nums[i]);
          p2 = p1;
          p1= c;
        }
        return p1;
    }
}

public void main(String[] args) {
    int nums[] = {1,2,3,4};
    HouseRobber k  = new HouseRobber();
    k.optiSpace(nums);
    k.dpArray(nums);
}