class Solution 
{
    public int majorityElement(int[] nums) 
    {
        int e,max=0,c=0;
        for(int i=0;i<nums.length;i++)
        { 
            e=nums[i];
            c=0;
            for(int j=0;j<nums.length;j++)
            {
                if (nums[j]==e)
                {
                c++;                
                }

            }
           if (c>Math.floor(nums.length/2))
           {max=nums[i];
           break;}
        
        }
        return max;
    }
}
