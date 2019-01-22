class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        //for loop throug the left to right bounds
            //maybe to string then to int see if it divisble
            
            
        List<Integer> res = new ArrayList<>();
        
        //iterating the numbers
        for(int num = left; num <=right ; num++){
            if(isDivisor(num)){
                res.add(num);
            }
        }

        return res;
    }
    
    
    
    //go through the digits if it is not the return false;
    //default is true ;]
    
    //
    public boolean isDivisor(int num ){
        //some edge case needed here
        
        
        int cur = num;
        
        while(cur > 0 ){
            int digit = cur%10;
            if( digit == 0) return false;
            if(num % digit > 0) return false;
            cur/=10;    
        }
        return true;
    }
}