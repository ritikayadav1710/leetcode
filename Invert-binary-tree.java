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
    public void helpInvert(TreeNode root) {
        if(root==null) return;
        TreeNode temp= root.left;
        root.left= root.right;
        root.right= temp;
        helpInvert(root.left);
        helpInvert(root.right);
    }
    public TreeNode invertTree(TreeNode root) {
        helpInvert(root);
        return root;
    }
}
