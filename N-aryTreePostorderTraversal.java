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
	//do it as preorder 
	// curr then children
	// post order is same as reverse preorder going right most instead of left
	// left right curr = reverse ( curr right left)
    public List<Integer> postorder(Node root) {
    	List<Integer> res = new ArrayList<>();
    	if(root == null) return res;
    	Stack<Node> stack = new Stack<>();
    	stack.push(root);

    	while(!stack.isEmpty()){
    		Node curr = stack.pop();
	    	res.add(curr.val);
	    	if(curr.children != null){
    			for(Node child : curr.children){
    				stack.push(child);
    			}
    		}
    	}
    	Collection.reverse(res);
    	return res;
    }
    /*//iterative using array list
    public List<Integer> postorder(Node root) {
    	List<Integer> res = new ArrayList<>();


    	Stack<Node> stack = new Stack<>();
    	stack.add(root);

    	while(!stack.isEmpty()){
    		Node curr = stack.pop();
    		for(int i = curr.children.size()-1;i>=0;i--){
    			stack.push(curr.children.get(i));
    		}

    	}

    	return res;

    }
	*/
    /*
    //recursive
    public List<Integer> postorder(Node root) {

    	List<Integer> res = new ArrayList<>();    	
    	if(root==null) return null;

    	helper(root,res);

        return res;
    }

    public void helper(Node root , List<Integer> res){

    	if(root == null) return;
    	if(root.children!=null&& curr.children.size()>0){
    		for(Node child : root.children){
    			helper(child,res);
    		}
   		}

   		res.add(root.val);
    }
    */
}