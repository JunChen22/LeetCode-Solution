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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        
        //i guess goes the the left most then back up 
        // then right then left most again and see if the leaves
        // are the same
        
        
        return traverse(root1).equals(traverse(root2));
        
        
    }


    //its DFS to return the leafs inorder
    public String traverse(TreeNode root){

    	//if root is null
    	if(root == null){

    		return "";
    	}

    	//if no left or right child
    	if(root.left == null && root.right == null){
    		return root.val+"-";
    	}

    	//first left then right child
    	return traverse(root.left) + traverse(root.right);
    }
}