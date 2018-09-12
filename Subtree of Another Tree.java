/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isSubtree(TreeNode s, TreeNode t) {
        
		//if tree s is null then return false
		if(s == null){
			return false;
		}
		//if the current s is same as t 
		// checks the whole current tree/s
		if(isSame(s,t)) return true;
		
		//check if either left or right is the sub tree

		return isSubtree(s.left,t)||isSubtree(s.right,t);
    }
	
	
	public boolean isSame(TreeNode s, TreeNode t){
		
		//if both are null
		if(s==null && t==null){
			return true;
		}
		
		//if either is null
		if(s == null || t == null ){
			return false;
		}
		
		//if their value is same or not
		if(s.val != t.val) return false; 
		
		//return/move on to left and righ tree
		return isSame(s.left,t.left) && isSame(s.right,t.right);
	}
}