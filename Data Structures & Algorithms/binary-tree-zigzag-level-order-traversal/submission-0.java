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
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> res = new ArrayList<>();
        int index=0;
        queue.add(root);

        while(!queue.isEmpty()){
            List<Integer> level = new ArrayList<>();
            
            for(int i=queue.size();i>0;i--){
                TreeNode node =queue.poll();
                if(node!=null){
                    level.add(node.val);
                    queue.add(node.left);
                    queue.add(node.right);
                }
            }
           
            if(index%2!=0){
            Collections.reverse(level);
            }
            index++;
            if(level.size()>0){
                res.add(level);
             }
            }
            return res;
        }
}
        
        
   