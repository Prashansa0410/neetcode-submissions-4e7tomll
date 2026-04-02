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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> list = new LinkedList<>();
        if(root==null){
            return list;
        }
        queue.add(root);
        queue.add(null);
        List<Integer> tempList = new LinkedList<>() ;

        while(!queue.isEmpty()){
            TreeNode current = queue.remove();
            
            if(current==null){
                list.add(tempList);
                tempList=new LinkedList<>();
                if(queue.isEmpty()){
                  break;
                  }
                else {
                  queue.add(null);
                }
            }
            else{
                tempList.add(current.val);
                if(current.left!=null){
                queue.add(current.left);
                }
                if(current.right!=null){
                queue.add(current.right);
                }

            }    
        }
     
     return list;
    }
}
