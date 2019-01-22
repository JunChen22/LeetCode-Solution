class Solution {
    public int arrayPairSum(int[] nums) {

    	//sort the array of integers
        Arrays.sort(nums);
        int sum = 0;

        // since it's already sorted the every other number is the min of the next 
        // just add it to the sum
        for(int i = 0 ; i < nums.length;i+=2){
            sum += nums[i];
        }
        
        return sum;
    }
}