/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/
class Solution {

    //iterative
    public List<List<Integer>> levelOrder(Node root) {
        
    	List<List<Integer>> res = new ArrayList<List<Integer>>();
    	if(root == null) return res;

    	Queue<TreeNode> queue = new LinkedList<>();

    	queue.add(root);

    	while(!queue.isEmpty()){

    	// add children to queue
    	//create sub list the adds to the result list
    	// iterate the children list 

    		int levelNum = queue.size();

    		List<Integer> subList = new LinkedList<Integer>();

    		//iterate current node's childrens
            for(int i=0; i<levelNum; i++) {

            	//adds the childrens of current node children
            	for(Node child : queue.peek().children){
            		if(child!=null)queue.add(child);
            	}

            	//after adding childrens ,add curr val to the list
            	subList.add(queue.poll().val);
            }
            res.add(subList);
    	}
    	return res;
    }

    /*
    //recursively
    public List<List<Integer>> levelOrder(Node root) {
    	List<List<Integer>> res = new ArrayList<List<Integer>>();
  		helper(res,root,0);
        return res;
    }
    
    
    public void helper(List<List<Integer>> res, Node root, int height) {
    	//root is null
    	//if child exist then heigh is increased
    	if(root==null) return ;
    	if (height >= res.size()) {
            res.add(new LinkedList<Integer>());
        }
    	res.get(height).add(root.val);

    	//iterat through through the childrens
    	for(Node child : root.children){
    		helper(res,child,height+1);
    	}
    }
    */
}