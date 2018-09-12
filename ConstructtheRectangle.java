class Solution {
    public int[] constructRectangle(int area) {
        
        //len and wid
        //len >= wid
    	int res = new int[2];	
        if(area <=0) return res;

        int wid = (int)Math.sqrt(area);
        while(area%wid !=0){
            wid--;
        }

        len = area/wid;
        res[0]= len;
        res[1] = wid;

        return res;
    }
}