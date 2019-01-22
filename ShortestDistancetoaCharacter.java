class Solution {
    public int[] shortestToChar(String S, char C) {
        
        //create a list 
        char[] cs = S.toCharArray();
        
        List<Integer> ls = new ArrayList<Integer>();
        int dis = 0;
        for(char c : cs ){
            if(c == C){
                ls.add(dis);
                dis = 0;
                continue;
            }
            dis++;
        }
        
        //change list to array
        
    }
}