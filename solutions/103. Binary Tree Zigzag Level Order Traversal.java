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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
   List<List<Integer>> res = new ArrayList<List<Integer>>();

        //if root is null
        if(root == null) return res;

        //use a queue to keep track of nodes
        List<TreeNode> ls = new LinkedList<>();
        ls.add(root);

        //needs a level num to determine the zig and zag
        int level = 1;
        TreeNode curr ;
        //iterate throught the queue list
        while(!ls.isEmpty()){

            //needs queue size
            int size = ls.size()-1;

            System.out.println(size);
            System.out.println(ls.get(0).val);
            //need new array list to add to res
            List<Integer> temp = new ArrayList<>();
            //if level is even the iterate right to left
            if(0==level%2)
            {
                //iterate the nodes
                for(int i = 0 ; i < size; i++){
                    //adds children if exist then
                    curr = ls.get(i);
                    System.out.println("at " + curr.val);
                    if(curr.left!= null){
                        ls.add(curr.left);
                        System.out.println("added");
                    };
                    if(curr.right!= null) ls.add(curr.right);

                    //adds val to the new array
                    temp.add(curr.val);

                    //remove
                    ls.remove(i);
                }
            }else{
                //if level is odd the iterate left to right

               //iterate the nodes
                for(int i = size ; i >=0 ; i--){
                    //adds children if exist then
                    curr = ls.get(i);
                    if(curr.left!= null) ls.add(curr.left);
                    if(curr.right!= null) ls.add(curr.right);

                    //adds val to the new array
                    temp.add(curr.val);

                    //remove
                    ls.remove(i);
                }
            }

            //increase the level
            level+=1;
            //adds the new array to res
            res.add(temp);
        }
        return res;
    }
    */

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
   List<List<Integer>> res = new ArrayList<List<Integer>>();

        //if root is null
        if(root == null) return res;

        //use a queue to keep track of nodes
        Queue<TreeNode> ls = new LinkedList<>();
        ls.add(root);

        //needs a level num to determine the zig and zag
        int level = 1;
        //iterate throught the queue list

        while(!ls.isEmpty()){

            //needs queue size
            int size = ls.size()-1;

            //need new array list to add to res
            List<Integer> temp = new ArrayList<>();
            //if level is even the iterate right to left
            if(0==level%2)
            {

            }else{

            }
            //increase the level
            level+=1;
            //adds the new array to res
            res.add(temp);
        }
        return res;
    }
}
