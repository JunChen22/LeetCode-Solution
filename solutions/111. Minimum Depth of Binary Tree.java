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

    //iterative,BFS
    public int minDepth(TreeNode root) {

        if(root == null) return 0;

        Queue<TreeNode> nodeQ = new LinkedList<>();
        nodeQ.add(root);
        int level = 0;

        while(!nodeQ.isEmpty()){
            int len = nodeQ.size();
            level++;
            for(int i = 0 ; i < len ; i++){
                TreeNode curr = nodeQ.poll();
                if(curr.left==null && curr.right == null){
                    return level;
                }else{ //children exist, goes to next level
                    if(curr.left!=null) nodeQ.add(curr.left);
                    if(curr.right!=null) nodeQ.add(curr.right);
                }
            }
        }
        return level;
    }


    /*
    //iterative ,DFS
    public int minDepth(TreeNode root) {

    }

    //recurisve ,DFS
    public int minDepth(TreeNode root) {

    }
    */
}
