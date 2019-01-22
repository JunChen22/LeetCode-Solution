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
	
	
    public List<List<String>> printTree(TreeNode root) {
		
		int row = getHeight(root);
		int col = (int)Math.pow(2,row) - 1 ;
        
        
		List<List<String>> res = new LinkedList<>();
		List<String> templs = new LinkedList<>();
		for(int i = 0; i< col; i++) templs.add("");
		for(int j = 0; j < row; j++) res.add(new ArrayList<>(templs));
		
		fillTree(root, res, 0, row, 0, col - 1);
		
		return res;
    }
    // need root/currentnd ,current row/height, total heigh , current col , total col,the result to be filled
    public void fillTree(TreeNode root, List<List<String>> result, int curRow, int totalRow, int start, int end) {
		if(root == null || curRow == totalRow)  return;
        
        int pos = (start+end)/2;
		result.get(curRow).set(pos, String.valueOf(root.val));
		fillTree(root.left, result, curRow + 1, totalRow, start, pos - 1);
		fillTree(root.right, result, curRow + 1, totalRow, pos + 1, end);
	}
	
	
    private int getHeight(TreeNode root){
        
        if(root == null)return 0;
        return 1 + Math.max(getHeight(root.left),getHeight(root.right));
    }
    
}