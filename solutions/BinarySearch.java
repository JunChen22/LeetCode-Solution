class Solution {
    public int search(int[] nums, int target) {
        

    	// need left ,right , and middle
    

    	int left =0;
    	int right =nums.length-1;

    	//compare indexes 
    	//and middle is index too 
    	while(left<=right){

    		int mid = (left + (right-left))/2; 
    		if(target == nums[mid]) return mid;
    		if(target > nums[mid]){
    			left = mid + 1;
    		}else{
    			right = mid -1;
    		}
    	}
    	//if doesn find , return -1 
    	//else return the index
    	return -1;
    }
}