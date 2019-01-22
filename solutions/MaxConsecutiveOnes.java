class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxConsec = 0;
        
        //current counting max consecutive
        int numConsec = 0;
        
        
        for(int num : nums){
            if(num>0){
                numConsec++;
            }else{
                numConsec = 0;
            }
            
            if(numConsec>maxConsec){
                maxConsec = numConsec;
            }
        }
        
        return maxConsec;
    }
}