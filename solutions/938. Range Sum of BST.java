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
    //iterative,BFS
    public int rangeSumBST(TreeNode root, int L, int R) {
        if(root == null) return 0;
        int sum = 0;
        List<TreeNode> nodeQ = new LinkedList<>();
        nodeQ.add(root);
        while(!nodeQ,isEmpty()){
            TreeNode curr = nodeQ.poll();
            //check if in range
            if(L<=curr.val && curr.val <= R)sum+= curr.val;
            //add childrens if exist
            if(curr.left!=null)nodeQ.add(curr.left);
            if(curr.right!=null)nodeQ.add(curr.right);
        }
        return sum;
    }

    //iterative,DFS
    public int rangeSumBST(TreeNode root, int L, int R) {
        return 2;
    }
    */
    //recursive,DFS
    public int rangeSumBST(TreeNode root, int L, int R) {
        if(root ==null) return 0;
        return DFS(root,L,R);
    }

    public int DFS(TreeNode root,int L, int R){
        if(root == null ) return 0 ;
        int sum = DFS(root.left) + DFS(root.right);
        return (L<= root.val && root.val<= R ? sum+root.val: sum)
    }
}
