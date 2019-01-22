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

    //Iterative , BFS
    public int findBottomLeftValue(TreeNode root) {

        Queue<TreeNode> nodeQ = new LinkedList<>();
        nodeQ.add(root);

        TreeNode leftNode = nodeQ.peek();
        while(!nodeQ.isEmpty()){
            leftNode= nodeQ.peek();
            int len = nodeQ.size();
            for(int i = 0;i < len ;i++){
                TreeNode curr = nodeQ.poll();
                //add children if exist
                if(curr.left!=null) nodeQ.add(curr.left);
                if(curr.right!=null) nodeQ.add(curr.right);
            }
        }
        return leftNode.val;
    }
}
