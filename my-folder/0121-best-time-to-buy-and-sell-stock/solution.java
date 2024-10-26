class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        // int ans=0;
        int lp=Integer.MAX_VALUE; //least price
        int op=0;  //overall profit
        for(int i=0;i<n;i++){
            if(prices[i]<lp){
                lp=prices[i];
            }
            op=Math.max(op,prices[i]-lp);
        }
        return op;
    }
}
