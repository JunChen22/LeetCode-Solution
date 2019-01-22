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
    //iterative ,BFS
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if(root == null) return res;
        Queue<TreeNode> nodeQ = new LinkedList<>();
        nodeQ.add(root);
        TreeNode curr ;

        while(!nodeQ.isEmpty()){
            int size = nodeQ.size();
            int max = Integer.MIN_VALUE;
            for(int i = 0;i< size; i++){
                curr = nodeQ.poll();
                if(curr.left!=null) nodeQ.add(curr.left);
                if(curr.right!=null) nodeQ.add(curr.right);
                if(curr.val>max) max = curr.val;
            }
            res.add(max);
        }
        return res;
    }
    */
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> res = new ArrayList<>();

        return res;
    }
}
