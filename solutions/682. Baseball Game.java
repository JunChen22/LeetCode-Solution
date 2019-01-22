class Solution {
    public int calPoints(String[] ops) {

        Stack<Integer> st = new Stack();
        for(String str : ops){
            switch(str){
                case "C":
                    st.pop();
                    break;
                case "D" :
                    st.push(2 * st.peek());
                    break;
                case "+":
                    int temp = st.pop();
                    int temp2 = temp+ st.peek();
                    st.push(temp);
                    st.push(temp2);
                    break;
                default:
                    st.push(Integer.valueOf(str));
                    break;
            }
        }

        int sum = 0 ;
        while(!st.isEmpty()){
            sum+=st.pop();
        }
        return sum;
    }
}
