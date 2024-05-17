public class Solution {
    TreeNode r = null;
    public TreeNode removeLeafNodes(TreeNode root, int target) {
        r = root;
        dfs(root, target, null, -1);

        return r;
    }

    void dfs(TreeNode root, int target, TreeNode parent, int side) {
        if(root == null) {
            return;
        }
        dfs(root.left, target, root, 0);
        dfs(root.right, target, root, 1);
        if(root.left == null && root.right == null && root.val == target) {
            if(side == -1) {
                r = null;
            }else {
                if(side == 0) {
                    parent.left = null;
                }else if(side == 1) {
                    parent.right = null;
                }
            }

        }

    }
}
