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
    public boolean isSymmetric(TreeNode root) {
	
		// it's true if root dont have any child or helper return true  or false
        return (root == null ) && (helper(root.left,root.right);
    }
    
    boolean helper(TreeNode left,TreeNode right){
		
		// if either one of the left or right node is null ,return false
		if(left == null || right == null){
			return (left == right);
		}
		
		//if they dont match one of other return false
		if(left.val != right.val){
			return false;
		}
		
		////move on the left then right sub tree
		return (helper(left.left,right.right)) && (helper(left.right,right.left));
		
	}
}