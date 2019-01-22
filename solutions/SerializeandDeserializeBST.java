/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

	//==============================Recursively===============

    /* recursivly 

	//DFS
    public String serialize(TreeNode root) {

    }
    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        
    }
	*/

    //==============================Iterative==================
	// BFS
    // Encodes a tree to a single string.

    //wtf is this bull shit 
    // do it in preorder 
    //so food meat vegies beef chicken null mushroom 
    public String serialize(TreeNode root) {
       //			food 								0 		logn   nlogn
        //		meat    vegies							1
        // 	beef  chicken   null mushroom				2
        //  cow  bison pigeon null __ __  wild 	null 		3

        //if root is null then return empty string;
        if (root == null) return "";

        //use string builder to append on to it 
        Queue<TreeNode> nodeQ = new LinkedList<>();
        StringBuilder res = new StringBuilder();
        nodeQ.add(root);
        res.append(String.valueOf(root.val));
        res.append(' ');
        //use queue to keep track 
        while (!nodeQ.isEmpty()) {
            TreeNode curr = nodeQ.poll();
            if(curr.left == null){
                res.append("null ");
            } else{
                nodeQ.add(curr.left);
                res.append(String.valueOf(curr.left.val));
                res.append(' ');
            }

            if (curr.right == null){
                res.append("null ");
            } else {
                nodeQ.add(curr.right);
                res.append(String.valueOf(curr.right.val));
                res.append(' ');
            }
        }
        System.out.println(res.toString());
        return res.toString();
    }

   

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data =="") return null;
		String[] splited = data.split("\\s+");

		for(String str : splited){
			System.out.println(str);
		}
		//
		//want to use 2^level
		
		while()


    }
	
	/* DFS
	public String serialize(TreeNode root) {
       //			food 								0 		logn   nlogn
        //		meat    vegies							1
        // 	beef  chicken   null mushroom				2
        //  cow  bison pigeon null __ __  wild 	null 		3
	}

   

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
    }
	*/

}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.deserialize(codec.serialize(root));