class MinimumDepthOfBinaryTree {

  public int minDepth(TreeNode root) {
    if (root == null) {
      return 0;
    }
    int left = minDepth(root.left);
    int right = minDepth(root.right);
    int min = 1;
    if (left == 0) {
      return right + min;
    }
    if (right == 0) {
      return left + min;
    }
    return Math.min(left, right) + min;
  }
}
