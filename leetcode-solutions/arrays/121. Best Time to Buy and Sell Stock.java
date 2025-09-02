class Solution {
    public int maxProfit(int[] prices)
    {
        if(prices.length==1)
        return 0;
        int c=prices[0],p=0,max=0;
        for(int i=1;i<prices.length;i++)
        {
           if(prices[i]>c)
           {
            p=prices[i]-c;
            max=Math.max(p,max);
           }
           if(prices[i]<c)
           c=prices[i];
        }
        return max;
    }
}
