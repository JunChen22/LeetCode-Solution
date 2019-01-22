class Solution {
    public boolean judgeCircle(String moves) {
        int xpos = 0,ypos = 0;
        for(char c : moves.toCharArray()){
            if(c == 'U'){
                ypos+=1;
            }
            if(c == 'D'){
                ypos-=1;
            }
            if(c == 'L'){
                xpos-=1;
            }
            if(c == 'R'){
                xpos+=1;
            }
        }
        
        return (ypos ==0 & xpos==0 )? true: false;
    }
}