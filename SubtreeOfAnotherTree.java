class SubtreeOfAnotherTree {

  public boolean isSubtree(TreeNode s, TreeNode t) {
    if (s == null) {
      return false;
    }
    if (t == null) {
      return true;
    }
    if (s.val == t.val && compareTrees(s, t)) {
      return true;
    }
    return isSubtree(s.left, t) || isSubtree(s.right, t);
  }

  private boolean compareTrees(TreeNode root1, TreeNode root2) {
    if (root1 == null && root2 == null) {
      return true;
    }
    if (root1 == null || root2 == null) {
      return false;
    }
    if (root1.val != root2.val) {
      return false;
    }
    return compareTrees(root1.left, root2.left) && compareTrees(root1.right, root2.right);
  }
}
