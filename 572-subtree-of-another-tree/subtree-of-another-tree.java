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
    public boolean isSame(TreeNode p, TreeNode q) {
        if((p==null)||q==null||p.val!=q.val) return p==q;
        return isSame(p.left,q.left) && isSame(p.right,q.right);

    }
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root==null) return false;

        return isSame(root,subRoot)|| isSubtree(root.left,subRoot)||isSubtree(root.right,subRoot);
        
    }
}