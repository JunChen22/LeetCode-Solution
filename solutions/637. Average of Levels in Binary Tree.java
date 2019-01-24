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
    //iterative , BFS
    public List<Double> averageOfLevels(TreeNode root) {

        List<Double> avges = new ArrayList<>();

        Queue<TreeNode> nodeQ  = new LinkedList<>();
        nodeQ.add(root);

        while(!nodeQ.isEmpty()){
            double sum = 0 ;
            int len = nodeQ.size();

            //iterate through the all nodes and add children of a level
            for(int i = 0 ; i < len;i++){
                TreeNode curr = nodeQ.poll();
                sum+= curr.val;
                if(curr.left!=null)nodeQ.add(curr.left);
                if(curr.right!=null)nodeQ.add(curr.right);
            }
            avges.add(sum/len);
        }
        return avges;
    }

    /*
    //iterative ,DFS
    public List<Double> averageOfLevels(TreeNode root) {

    }

    //recursive ,DFS
    public List<Double> averageOfLevels(TreeNode root) {

    }
    */
}
