class Solution {
    private int result = 0; // to store the global diameter

    public int diameterOfBinaryTree(TreeNode root) {
        solve(root);
        return result;
    }

    public int solve(TreeNode root) {
        // Base condition
        if (root == null) {
            return 0;
        }

        // Recursive call: get heights of left and right subtrees
        int left = solve(root.left);
        int right = solve(root.right);

        // temp = height of current node
        int temp = Math.max(left, right) + 1;

        // ans = diameter through this node (edges)
        int ans = left + right;

        // result = update global diameter if needed
        result = Math.max(result, ans);

        return temp; // return height to parent
    }
}
