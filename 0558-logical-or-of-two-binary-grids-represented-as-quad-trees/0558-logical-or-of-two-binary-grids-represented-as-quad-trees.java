/*
// Definition for a QuadTree node.
class Node {
    public boolean val;
    public boolean isLeaf;
    public Node topLeft;
    public Node topRight;
    public Node bottomLeft;
    public Node bottomRight;

    public Node() {}

    public Node(boolean _val,boolean _isLeaf,Node _topLeft,Node _topRight,Node _bottomLeft,Node _bottomRight) {
        val = _val;
        isLeaf = _isLeaf;
        topLeft = _topLeft;
        topRight = _topRight;
        bottomLeft = _bottomLeft;
        bottomRight = _bottomRight;
    }
};
*/

class Solution {
     public Node intersect(Node quadTree1, Node quadTree2) {
        // if the first one is leaf
        // that means all values are same (1 or 0)
        // if it is 1, then I dont need to consider about others as it is OR operation
        // if it is 0, then I need to consider the other one as becuase other one could be 1 or 0
        if(quadTree1.isLeaf) {
            return quadTree1.val ? quadTree1 : quadTree2;
        }

        else if(quadTree2.isLeaf) {
            return quadTree2.val ? quadTree2 : quadTree1;
        }

        // if both are not leaf node
        // then recurse for each child, topLeft, topRight, bottomLeft, bottomRight
        // create a new node, point the topLeft to new node's topLeft and so on
        // but before connect check, all 4 child is leaf node and all 4 child values are same
        // if yes, then current new node will be leafnode and value will be any one child's value
        else {
            Node node = new Node();
            Node topLeft = intersect(quadTree1.topLeft, quadTree2.topLeft);
            Node topRight = intersect(quadTree1.topRight, quadTree2.topRight);
            Node bottomLeft = intersect(quadTree1.bottomLeft, quadTree2.bottomLeft);
            Node bottomRight = intersect(quadTree1.bottomRight, quadTree2.bottomRight);

            if(topLeft.isLeaf && topRight.isLeaf && bottomLeft.isLeaf && bottomRight.isLeaf &&
                topLeft.val == topRight.val && topRight.val == bottomLeft.val && bottomLeft.val == bottomRight.val) {
                    node.isLeaf = true;
                    node.val = topLeft.val;
                }

            else {
                node.topLeft = topLeft;
                node.topRight = topRight;
                node.bottomLeft = bottomLeft;
                node.bottomRight = bottomRight;
            }

            return node;

        }

    }
}