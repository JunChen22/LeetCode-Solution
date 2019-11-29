class Solution {
    public int maxProfit(int[] prices) {
    	int maxProfit = 0;
    	int min = Integer.MAX_VALUE;
    
    	for(int price:prices){
    		if(price< min){
    			min  = price;
    		}else if(price - min > maxProfit){
    			maxProfit = price - min;
    		}
    	}
    	return maxProfit;
    }
}