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
	//preorder  curr then children
	// in this case list of children
    public List<Integer> preorder(Node root) {
    	List<Integer> res = new ArrayList<>();

    	if(root ==null ) return res;
    	Stack<Node> stack = new Stack<>();
    	stack.push(root);

    	while(!stack.empty()){
    		Node curr = stack.pop();
    		res.add(curr.val);
    		for(int i = curr.children.size()-1;i >=0;i--){
    			stack.push(curr.children.get(i));
    		}

    	}
    	return res;
    }
    
    /*
    //recurseive
	public List<Integer> preorder(Node root) {
    	List<Integer> res = new ArrayList<>();
    	if(root ==null ) return res;
    	helper(root,res);
    	return res;
    }

   	public void helper(Node root ,List<Integer> res ){
   		//if root is null
   		if(root == null) return ;
   		res.add(root.val);
   		//iteras throug the list of children
   		if(root.children!=null && root.children.size()>0){
   			for(Node child :root.children){
   				helper(child,res);
   			}
   		}
   	}
   	*/
}