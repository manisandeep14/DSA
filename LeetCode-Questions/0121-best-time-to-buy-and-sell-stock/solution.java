class Solution {
    public int maxProfit(int[] prices) {
        
        if(prices.length < 2) return 0;

        //This is just one line optimized than mine found in leetcode

        int minStock = prices[0];
        int maxProfit =  0;

        for(int i = 1; i < prices.length; i++){
            if(prices[i] < minStock){
                minStock = prices[i];
            }else{
                maxProfit = Math.max(maxProfit, prices[i]-minStock);
            }

        }

        return maxProfit;

        // my code

        // int s = 0;
        // int m = 0;
        // int profit = 0;

        // for(int i = 0; i < prices.length-1; i++){
        //     if(prices[i] < prices[i+1] && prices[i+1] > prices[m]) m = i+1;
        //     else if(prices[i] > prices[i+1] && prices[i+1] < prices[s]){
        //         s = i+1;
        //         m=s;
        //     }
        //     profit = Math.max(profit, (prices[m]-prices[s]));
        // }
        //return profit;

    }
}
