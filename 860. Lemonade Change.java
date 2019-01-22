class Solution {
    public boolean lemonadeChange(int[] bills) {
        //if bill is 20
        // either gives a 10 and 5 or 3 fives

        //if bill is 10
        // gives a 5 back

        //if bill is 5
        //gets bill

        int five = 0;
        int ten = 0;

        for(int i : bills){
            if(i == 5) five++;
            else if (i ==10) {ten++;five--;}
            else if (ten > 0) {ten--;five--;}
            else five-=3;
            if(five<0)return false;
        }

        return true;
    }
}
