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
    public String tree2str(TreeNode t) {
        if(t==null) return "";
        return DFS(t);
    }

    //DFS,pre-order,left right ,then current
    //just traversaling but returns strings
    public String DFS(TreeNode root){
    	if(root==null)return "";
    	String left = "("+DFS(root.left)+")";
    	String right = "("+DFS(root.right)+")";
    	return root.val+"("+left+right+")"
    }
}