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
    //recursive,DFS
    public boolean hasPathSum(TreeNode root, int sum) {
        //if root is null it's false
        if(root == null) return false;

        //check when it's leaf and equals to sum
        if(root.left==null && root.right==null && sum - root.val == 0 ) return true;

        //calls children ,just need one to be true
        return hasPathSum(root.left,sum-root.val)&&hasPathSum(root.right,sum-root.val);
    }
    */

    //iteratively , DFS
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root==null) return false;

        //use queue for DFS
        Queue<TreeNode> nodeQ = new LinkedList<>();
        Queue<Integer> pathQ = new LinkedList<>();

        nodeQ.add(root);
        pathQ.add(sum);

        while(!nodeQ.isEmpty()){
            TreeNode curr = nodeQ.poll();
            int res = pathQ.poll();
            if(curr.left ==null && curr.right ==null&& res- root.val == 0){
                return true;
            }else{

            }

        }


    }

    /*
    //iteratively, BFS
    public boolean hasPathSum(TreeNode root, int sum) {

    }
    */

}
