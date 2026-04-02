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

        int diameter1 = diameterOfBinaryTree(root.left);
        int diameter2 = diameterOfBinaryTree(root.right);
        int diameter3 = height(root.left)+height(root.right);
        return Math.max(diameter3,Math.max(diameter2,diameter1));
    }

    public int height(TreeNode root){
        if(root==null){
            return 0;
        }
        int count1=height(root.left);
        int count2=height(root.right);
        return 1+Math.max(count1,count2);
    }
}
