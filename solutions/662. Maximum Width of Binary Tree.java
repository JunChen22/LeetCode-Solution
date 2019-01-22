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
    //iteratively ,BFS
    public int widthOfBinaryTree(TreeNode root) {
        if(root ==null ) return 0;
        int maxWidth = 1;


        //using a queue to keep track of children
        Queue<TreeNode> nodeQ = new LinkedList<>();
        nodeQ.add(root);

        while(!nodeQ.isEmpty()){
            int size = nodeQ.size();
            for(int i = 0 ; i< size;i++){
                TreeNode curr = nodeQ.poll();
                //iterate throug hthe queue
                // if curr is
                if(curr.left==null){
                    nodeQ.add(null);
                }else{
                    nodeQ.add()
                }

            }

        }
    }
}
