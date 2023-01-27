/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public int maxDepth(Node root) {
        
        if(root == null) {
            return 0;
        }
        
        //already height is 1 if node is not null
        int height = 1;
        
        for(Node node : root.children) {
            
			//track max height.
            height = Math.max(height, 1+maxDepth(node)); //1+maxDepth(node) will calculate depth recursively.
        }
        
        return height;
        
    }

}