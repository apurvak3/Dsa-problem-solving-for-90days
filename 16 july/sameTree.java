/**
 * sameTree
 */
public class sameTree {

    public static void main(String[] args) {
        Solution sameTree = new Solution();
        
        // Create first tree
        TreeNode tree1 = new TreeNode(1);
        tree1.left = new TreeNode(2);
        tree1.right = new TreeNode(3);

        // Create second tree
        TreeNode tree2 = new TreeNode(1);
        tree2.left = new TreeNode(2);
        tree2.right = new TreeNode(3);

        // Check if the trees are the same
        boolean result = sameTree.isSameTree(tree1, tree2);
        System.out.println("Are the trees the same? " + result);
    }
}

/**
 * TreeNode
 */
class TreeNode {
    int val;
    TreeNode right;
    TreeNode left;

    TreeNode(int x) {
        val = x;
        left = null;
        right = null;
    }
}

/**
 * Solution
 */
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        } else if (p == null || q == null) {
            return false;
        } else {
            return p.val == q.val && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        }
    }
}
