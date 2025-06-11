class Solution {
    public int maxProfit(int[] prices) {
        int minprof = Integer.MAX_VALUE;
        int maxprof = 0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<minprof)
                minprof = prices[i];
            else if(prices[i]-minprof>maxprof)
                maxprof = prices[i]-minprof;
        }
        return maxprof;
        
        
    }
}