class Solution {

    //use hashmap to find each count
    //and return the one with the same count
    public int repeatedNTimes(int[] A) {

        Map<Integer,Integer> numCount = new HashMap<>();

        //add the count
        for(int num : A){
            numCount.put(num,numCount.getOrDefault(num,0)+1);
        }

        //return which one have more than one count/or A.length/2 +1
        for(int k:numCount.keySet() ){
            if(numCount.get(k)  == A.length/2){
                return k;
            }
        }
        return -1;
    }

    //using hash , if repeated, thats the one
    //since it's all unique but one.
    public int repeatedNTimes(int[] A) {

        Set<Integer> numRepeat = new HashSet<>();

        for(int num : A){
            if(numRepeat.contains(num)){
                return num;
            }

            numRepeat.add(num);
        }

        return -1;
    }

    //split A into sub arrays
    public int repeatedNTimes(int[] A) {

    }
}
