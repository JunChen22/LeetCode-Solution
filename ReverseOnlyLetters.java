class Solution {
    public String reverseOnlyLetters(String S) {
        
        Stack<Character> stack = new Stack<>();
        for(Character c: S.toCharArray()){
        	if(Character.isLetter(c)){
        		stack.push(c);
        	}
        }

    	StringBuilder sb = new StringBuilder();

        int len = S.length();
        for(Character c: S.toCharArray()){
        	if(Character.isLetter(c)){
        		sb.append(stack.pop());
        	}else{
        		sb.append(c);
        	}
        }

        return sb.toString();
    }
}