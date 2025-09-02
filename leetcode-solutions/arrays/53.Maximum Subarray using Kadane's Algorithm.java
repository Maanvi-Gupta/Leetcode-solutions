class Solution {
    public int maxSubArray(int[] nums) 
    {
        int c=0;
        int max=-999999;
        for(int i=0;i<nums.length;i++)
        { 
            c+=nums[i];
            max=Math.max(c,max);
            if(c<0)
            c=0;

        }
        return max;
    }
}
