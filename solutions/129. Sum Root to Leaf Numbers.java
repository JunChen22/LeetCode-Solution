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
    //iteratively,BFS
    public int sumNumbers(TreeNode root) {
     if(root ==null) return 0;
        int sum = 0;

        //using queue<string> to keep track of path
        //if the node does have children then add to sum
        //else(a root ) then adds to a another queue of nodes
        Queue<String> paths = new LinkedList<>();
        Queue<TreeNode> nodeQ = new LinkedList<>();

        nodeQ.add(root);
        paths.add("");

        while(!nodeQ.isEmpty()){
            String path = paths.poll();
            TreeNode curr = nodeQ.poll();
            if(curr.left == null && curr.right==null){
                sum+=Integer.valueOf(path+curr.val);
            }else{
                if(curr.left!=null){
                    paths.add(path+curr.val);
                    nodeQ.add(curr.left);
                }
                if(curr.right!=null){
                    paths.add(path+curr.val);
                    nodeQ.add(curr.right);
                }
            }
        }
        return sum;
    }
    */

    //iteratively,DFS
    public int sumNumbers(TreeNode root) {
        if(root ==null) return 0;
        int sum = 0;


        //using stack to keep track of paths
        //and a stack queue to keep track of nodes

        //if the node have childrens , will add to the stack
        //and add the path to path stack

        Stack<String> paths = new Stack<>();
        Stack<TreeNode> nodeST = new Stack<>();

        paths.push("");
        nodeST.push(root);

        while(!nodeST.isEmpty()){
            TreeNode curr = nodeST.pop();
            String path = paths.pop();
            if(curr.left == null && curr.right==null){
                sum+=Integer.valueOf(path+curr.val);
            }else{
                //check right first to go leftest
                if(curr.right!=null){
                    paths.push(path+curr.val);
                    nodeST.push(curr.right);
                }
                if(curr.left!=null){
                    paths.push(path+curr.val);
                    nodeST.push(curr.left);
                }
            }
        }

        return sum;
    }
    /*
    //recursive
    public int sumNumbers(TreeNode root) {
        if(root ==null) return 0;
        int sum = 0;
        sum = DFS(root,"");
        return sum;
    }
    //DFS , pre order
    public int DFS(TreeNode root,String path){
        //if root is null , return notthing
        System.out.println(path);
        int sum = 0;
        if(root==null) return 0;
        //if both children is null , then is leaf
        //add Integer.valueOf(path + root.val) to sum
        if(root.left==null && root.right ==null){
            System.out.println("path is "+path + " root val is "+ root.val);
            sum += Integer.valueOf(path + root.val);
        }else{
            //calls childrens
            sum+=DFS(root.left,path + root.val);
            sum+=DFS(root.right,path + root.val);
        }
        return sum;
    }
    */
}
