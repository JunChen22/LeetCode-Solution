/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

public class BSTIterator {
    TreeNode root;
    public BSTIterator(TreeNode nd) {
        root = new TreeNode(0);
        root.left = nd;
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        if(root.left == null && root.right ==null)return false;
        return true;
    }

    /** @return the next smallest number */
    public int next(){
        if(root.left==null){
        	if(root.val > ){
        		
        	}
            root = root.right;
            return root.val;
        }
        root = root.left;
        return root.val;
    }
}


/**
 * Your BSTIterator will be called like this:
 * BSTIterator i = new BSTIterator(root);
 * while (i.hasNext()) v[f()] = i.next();
 */