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

public class Codec {
    StringBuilder build = new StringBuilder();
    int index=-1;

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
       dfsSerialize(root,build);
       return build.toString();        
    }

    public void dfsSerialize(TreeNode root,StringBuilder build){
        if(root==null){
            build.append("N").append(",");
            return;
        }
       build.append(root.val).append(",");
       dfsSerialize(root.left,build);
       dfsSerialize(root.right,build);
       
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] list = data.split(",");
        return dfsDeserialize(list);

        
    }

    public TreeNode dfsDeserialize(String[] list){
        index++;
        if (list[index].equals("N")) {
            return null;
        }
        TreeNode node = new TreeNode(Integer.parseInt(list[index]));
        node.left = dfsDeserialize(list);
        node.right = dfsDeserialize(list);
        return node;
    }
}
