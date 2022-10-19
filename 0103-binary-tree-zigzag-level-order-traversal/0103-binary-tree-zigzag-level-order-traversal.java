/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> list=new ArrayList<>();
        levelOrder(list,root,0);
        return list;
    }
    private void levelOrder(List<List<Integer>> list,TreeNode root,int level){
        if(root == null)
            return ;
        if(list.size()<=level){
            LinkedList<Integer> newLevel =new LinkedList<>();
            list.add(newLevel);
        }
        if(level % 2 ==0){
            list.get(level).add(root.val);
        }
        else{
            list.get(level).add(0,root.val);
        }
        levelOrder(list,root.left,level+1);
        levelOrder(list,root.right,level+1);
    } 
}