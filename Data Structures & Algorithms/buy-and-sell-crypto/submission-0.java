class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i = 0; i < prices.length; i++)
        {
            if(prices[i] < minPrice)
            {
                minPrice = prices[i];
            }
            int sp = prices[i];
            int profit = sp - minPrice;
            if(profit > maxProfit)
            {
                maxProfit = profit;
            }
        }
        return maxProfit;
    }
}
