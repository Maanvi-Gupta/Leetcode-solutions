class Solution 
{
    public int majorityElement(int[] nums) 
    {
        Arrays.sort(nums);
        int e,max=0,c=0;
        for(int i=1;i<nums.length;i++)
        { 
            if(nums[i-1]==nums[i])
            c++;
            else
            c=1;
            if(c>(nums.length/2))
            {
                return nums[i];
            }
        
        }
        return nums[0];
    }
}
