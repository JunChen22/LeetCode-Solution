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

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if(root == null )return result;
        Queue<TreeNode> nodeQ = new LinkedList<>();
        nodeQ.add(root);

        //even will reverse , odd will not
        int lvl = 0 ;

        while(!nodeQ.isEmpty()){
            List<Integer> level = new ArrayList<>();
            int len = nodeQ.size();
            lvl++;
            for(int i = 0 ; i< len ; i++){
                TreeNode curr = nodeQ.poll();
                level.add(curr.val);
                if(curr.left!=null)nodeQ.add(curr.left);
                if(curr.right!=null)nodeQ.add(curr.right);
            }

            //if at even level , will reverse/zig the order
            if(lvl%2 == 0){
                Collections.reverse(level);
            }
            result.add(level);
        }

        return result;
    }

    /*
    //recursive,DFS
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
    }
    */
}
