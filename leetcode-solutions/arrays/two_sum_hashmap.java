import java.util.HashMap;
import java.util.Map;
class Solution 
{
    public int[] twoSum(int[] nums, int target) 
    {
        Map<Integer , Integer> c=new HashMap<>();
        for(int i=0;i<(nums.length);i++)
        {
            Integer index=c.get(nums[i]);
            if(index!=null)
            {return new int []{i,index};}
            c.put(target-nums[i],i);
        }
         return nums;
    }
    
}
