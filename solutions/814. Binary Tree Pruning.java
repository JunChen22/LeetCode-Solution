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
    //recursion , DFS
    public TreeNode pruneTree(TreeNode root) {
        if(root==null) return null;
        root = DFS(root);
        return root;
    }

    public TreeNode DFS(TreeNode root){
        //if root is 0 and children is null then return null
        if(root ==null ) return null;
        //calls children to a new node called left and right
        root.left = DFS(root.left);
        root.right = DFS(root.right);
        if(root.val ==0 && root.left ==null && root.right == null) return null;
        return root;
    }
}

