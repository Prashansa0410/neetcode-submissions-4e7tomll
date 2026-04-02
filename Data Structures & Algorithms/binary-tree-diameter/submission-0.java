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
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null){
            return 0;
        }
        int Diameter1= diameterOfBinaryTree(root.left);
        int Diameter2 = diameterOfBinaryTree(root.right);
        int Diameter3 = heightOfBinaryTree(root.left)+heightOfBinaryTree(root.right);
        return Math.max(Diameter3,Math.max(Diameter1,Diameter2));
    }
    public int heightOfBinaryTree(TreeNode root){
        if(root==null){
            return 0;
        }
        int leftHeight = heightOfBinaryTree(root.left);
        int rightHeight = heightOfBinaryTree(root.right);
        return 1+Math.max(leftHeight,rightHeight);
    }
}

