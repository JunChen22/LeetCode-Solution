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
    //recursion ,DFS
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if(root == null) return res;
        DFS(root,sum,new LinkedList(),res);
        return res;
    }

    //DFS,pre-order
    public void DFS(TreeNode root, int sum ,List<Integer> path,List<List<Integer>> res){

        //if root is null then return null
        if(root == null) return;

        path.add(root.val);

        //if the sum == root.val and is leaf then adds the path to the res
        if(root.val == sum && root.left == null && root.right ==null){
            res.add(new LinkedList(path));
            path.remove(path.size()-1);
            return;
        }else{
            //calls childrens
            DFS(root.left,sum-root.val,path,res);
            DFS(root.right,sum-root.val,path,res);
        }

        //if children finish, then remove the last one/added by children path
        path.remove(path.size()-1);
    }
    */


    /*
    //iterative ,BFS
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if(root == null) return res;





        return res;
    }

    */

    //iterative,DFS
    public List<List<Integer>> pathSum(TreeNode root, int sum) {

        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if(root == null) return res;

        //a stack to keep track of nodes
        //another stack of path
        Stack<TreeNode> nodeSt = new Stack<>();
        Stack<List<Integer>> paths = new Stack<List<Integer>>();

        //first node
        nodeSt.push(root);

        List<Integer> temp = new ArrayList();
        temp.add(0);
        paths.add(temp);

        while(!nodeSt.isEmpty()){
            TreeNode curr = nodeSt.pop();
            //end of path is the sum of the path
            List<Integer> path = paths.pop();
            int pathSum = path.remove(path.size()-1);

            //path sum is added add the end
            path.add(curr.val);

            //compare the path sum to sum and is leaf then add the path to res
            if(pathSum+curr.val == sum && curr.left==null && curr.right==null){
                //adds to res
                System
                path.remove(path.size()-1);
                res.add(path);
            }else{
                pathSum += curr.val;
                if(curr.right!=null){
                    nodeSt.add(curr.right);
                    path.add(pathSum);
                    paths.add(path);
                }
                if(curr.left!=null){
                    nodeSt.add(curr.left);
                    path.add(pathSum);
                    paths.add(path);
                }
            }
        }
        return res;
    }
}
