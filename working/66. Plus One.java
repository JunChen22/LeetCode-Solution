class Solution {
    public int[] plusOne(int[] digits) {
        
    	digits[digits.length-1] = digits[digits-1]++;
      	//
        for(int i = digits.length-1;i>0;i--){
        	if(digits[i]>9){
        		digits[i]=0;
        		digits[i-1]++;
        	}
        }


        if(digits[0]>0){
        	int[] newDigits = new int[digits.length+1];
        	
        	return 
        }

        return digits;
    }
}