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
	//recursive
    public TreeNode constructMaximumBinaryTree(int[] nums) {
		return construc(nums,0,nums.length);
	}
	public TreeNode construc(int[] nums,int l,int r){
		//find the max_num index
		if(l==r) return null;
		int max_idx = maxIndex(nums,l,r);
		TreeNode root = new TreeNode(nums[max_idx]);
		//nums[max_num index ] is the root
		root.left = construc(nums,l,max_idx);
		//nums.left = contruc(int[] nums, left,max_index)
		root.right = construc(nums,max_idx+1,r);
		//nums.left = contruc(int[] nums, max_index,end)
		return root;
	}

	public int maxIndex(int[] nums,int l,int r){
		int max = l;
		for(int i = l ; i<r; i++){
			if(nums[max]< nums[i]) max = i;
		}
		return max;
	}
	*/

	//iteratively
	public TreeNode constructMaximumBinaryTree(int[] nums) {

	}
}
