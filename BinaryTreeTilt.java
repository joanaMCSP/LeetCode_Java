class BinaryTreeTilt {

  public int findTilt(TreeNode root) {
    if (root == null) {
      return 0;
    }
    int sumLeft = sum(root.left);
    int sumRight = sum(root.right);
    int tilt = findTilt(root.left) + findTilt(root.right) + Math.abs(sumLeft - sumRight);
    return tilt;
  }

  private int sum(TreeNode root) {
    if (root == null) {
      return 0;
    }
    return root.val + sum(root.left) + sum(root.right);
  }
}
