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
    public int maxDepth(Node root) {

        if(root == null) return 0;
        int depth  = DFS(root);
        return depth;
    }

    //iteratively
    public int BFS(Node root){
        if(root == null) return 0;

        //use stack to keep track of childrens then move to next level
        // if null just dont add it to the stack
        // then keep process the nodes the level is the depth
        Queue<Node> que = new LinkedList<>();
        que.add(root);
        int depth = 0;
        while(!que.isEmpty()){
            int queueSize = que.size();
            depth++;
            for(int i = 0;i < queueSize; i++){
                Node curr = que.remove();
                for(Node child : curr.children){
                    if(child!=null) que.add(child);
                }
            }
        }
        return depth;
    }

    public int DFS(Node root){
        if(root == null) return 0;
        int currDepth = 0;
        for(Node child:root.children){
            int temp = DFS(child);
            if(currDepth <temp){
                currDepth = temp;
            }
        }
       return 1 + currDepth ;
    }
}
