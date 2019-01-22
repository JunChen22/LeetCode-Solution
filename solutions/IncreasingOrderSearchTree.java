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
	/*
   	//recursive
    public TreeNode increasingBST(TreeNode root) {
        if(root == null) return root;

        //get a list of lists then reverse it or so
        List<Integer> ls = new ArrayList<>();
        DFS(root,ls);
        
        TreeNode currNd = root;
        for(int i : ls){
            currNd.right = new TreeNode(i);
            currNd = currNd.right;
        }

        return root.right; 
    }

 	//DFS and inorder
    public void DFS(TreeNode root,List<Integer> ls){
    	//if root is null
    	if(root == null) return;
    	DFS(root.left,ls);
    	ls.add(root.val);
    	DFS(root.right,ls);
    }
    */

    //recursive ,DFS,Inorder but rightest then reverse
    public TreeNode increasingBST(TreeNode root) {
        return DFS(root);
    }

 	//DFS and inorder
    public void DFS(TreeNode root,List<TreeNode> ls){
    	//if root is null
    	if(root == null) return;
    	DFS(root.left);
    	ls.add(root.val);
    	DFS(root.right);
    }
    

    /*iterative
    public TreeNode increasingBST(TreeNode root) {
        
    }
    */
}