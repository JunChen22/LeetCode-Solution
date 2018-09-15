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
	/*recrusively
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        helper(res,root,0);
        return res;

    }

    public void helper(List<List<Integer>> res, TreeNode root, int height) {
    	//root is null
    	if(root==null) return ;

        //when reach to next level/children ,need to add more elements in res
    	if (height >= res.size()) {
            res.add(new LinkedList<Integer>());
        }

        //add current val to the "res[height]"
    	res.get(height).add(root.val);


    	//if child exist then heigh is increased
    	if(root.left!=null)helper(res,root.left,height+1);
    	if(root.right!=null)helper(res,root.right,height+1);
    }
	*/

    //iterative 
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();

        if(root == null) return res;

        Queue<TreeNode> queue = new LinkedList<>;

        queue.add(root);

        while(!queue.isEmpty()){
            int levelNum = queue.size();

            //create a list for each level
            List<Integer> subList = new LinkedList<Integer>();

            //iterate through the curent queues of nodes/level
            for(int i=0; i<levelNum; i++) {
            	//add children to queue if exist
                if(queue.peek().left != null) queue.add(queue.peek().left);
                if(queue.peek().right != null) queue.add(queue.peek().right);

                subList.add(queue.poll().val);
            }
            res.add(subList);
        }
        return res;
    }
    
}