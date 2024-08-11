//https://leetcode.com/problems/binary-tree-inorder-traversal/description/
class Solution {
 List<Integer> list = new ArrayList<>();
  public List<Integer> inorderTraversal(TreeNode root) {
      if(root == null){
          return new ArrayList<>() ;
      }
      inorderTraversal(root.left);
      list.add(root.val);
      inorderTraversal(root.right);
      return list;
  }
}