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

    //recursive,DFS
    public boolean isUnivalTree(TreeNode root) {
        if(root == null) return false;
        return DFS(root,root.val);
    }

    public boolean DFS(TreeNode root, int x){

        //if root is null
        if(root == null) return true;

        boolean left = true;
        boolean right = true;

        //calls children is exist
        if(root.left !=null)left = DFS(root.left,root.val);
        if(root.right !=null)right= DFS(root.right,root.val);

        //return if children
        return (left && right && root.val == x ? true:false);
    }

    /*
    //iterative,BFS
    public boolean isUnivalTree(TreeNode root) {
        if(root == null) return true;

        Queue<TreeNode> nodeQ = new LinkedList<>();
        nodeQ.add(root);

        int val = root.val;

        while(!nodeq.isEmpty()){
            TreeNode curr = nodeq.peek();

            //compare value
            if(val != curr.val) return false;

            //add childrens
            if(curr.left!=null) nodeq.add(curr.left);
            if(curr.right!=null) nodeq.add(curr.right);
        }
        return true;
    }
    */
}
