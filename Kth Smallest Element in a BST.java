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
	//recuvsive
	public int kthSmallest(TreeNode root, int k) {
		//with arraylist
		//add using add(pos,obj)

		List<Integer> res = new ArrayList<>();
		DFS(root,res);
		//then return with get obj 

		DFS(root,res);

		return 
    }
    //DFS,post order
    public void DFS(TreeNode root,List<Integer> res){
    	if(root==null ) return;
    	res.add()
    	DFS(root.left,res);
    	DFS(root.right,res);
    }

    /*
    //iterative
    public int kthSmallest(TreeNode root, int k) {
        
    }
    */
}