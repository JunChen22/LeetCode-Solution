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
	//iteratively
    public TreeNode searchBST(TreeNode root, int val) {

    	if(root == null) return root;

    	TreeNode curr = root;
    	while(curr!=null){
    		if(curr.val == val)return curr;
    		if(curr.val >val) curr = curr.left;
    		else if(curr.val <val) curr = curr.right;
    	}

    	return null;
 	}
    /*
    //recursively
    public TreeNode searchBST(TreeNode root, int val) {

    	if(root == null) return null;
    	if(root.val == val)return root;
 		if(root.val > val ) return searchBST(root.left,val);
		else if(root.val < val ) return searchBST(root.right,val);
 		return null;
 	}
 	*/
}