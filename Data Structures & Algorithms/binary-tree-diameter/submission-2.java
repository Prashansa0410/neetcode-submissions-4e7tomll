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

        int diameterLeft=diameterOfBinaryTree(root.left);
        int diameterRight=diameterOfBinaryTree(root.right);
        int height =heightofTree(root.left)+heightofTree(root.right);
        return Math.max(height,Math.max(diameterLeft,diameterRight));      
    }

    public int heightofTree(TreeNode root){
        if(root==null){
            return 0;
        }
       int count=0;
       int count1=0;
        count = heightofTree(root.left);
        count1=heightofTree(root.right);
       return 1+Math.max(count,count1);
        
    }
}
