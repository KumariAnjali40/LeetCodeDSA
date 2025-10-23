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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        
        inorderHelper(root, list);
        return list;
        
    }

     private void inorderHelper(TreeNode node, List<Integer> list) {
        if (node == null) return;

        inorderHelper(node.left, list);   
        list.add(node.val);               
        inorderHelper(node.right, list);  
    }
}