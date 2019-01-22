class Solution {
    public int maxProfit(int[] prices) {
    	int maxProfit = 0;
    	int min = Integer.MAX_VALUE;

    	//one pass 
    	//check for the lowest price day
    	//if lowest ,get the price to min price
    	//then set max profit to curr price - min
    	for(int price:prices){
    		if(price< min){
    			min  = price;
    		}else if(price - min > maxProfit){
    			maxProfit = prices - min;
    		}
    	}
    	return maxProfit;
    }
}