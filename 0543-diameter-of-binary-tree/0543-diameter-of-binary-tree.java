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
    static int diameter = 0;

    public int findDiameter(TreeNode node){
         diameter = 0;

        height(node);

        return diameter;
    }

    public static int height(TreeNode node){

        if(node == null) return 0;

        int leftNode = height(node.left);
        int rightNode = height(node.right);

        diameter = Math.max(diameter,leftNode+rightNode);

        return 1 + Math.max(leftNode, rightNode);
    }



    public int diameterOfBinaryTree(TreeNode root) {

        int ans = findDiameter(root);

        return ans;
    }
}