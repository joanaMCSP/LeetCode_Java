class DeleteNodeInBST {

  public TreeNode deleteNode(TreeNode root, int key) {
    if (root == null) {
      return null;
    }
    if (key < root.val) {
      root.left = deleteNode(root.left, key);
    } else if (key > root.val) {
      root.right = deleteNode(root.right, key);
    } else {
      if (root.left == null && root.right == null) {
        root = null;
      } else if (root.left == null) {
        root = root.right;
      } else if (root.right == null) {
        root = root.left;
      } else {
        int val = getMin(root.right);
        root.val = val;
        root.right = deleteNode(root.right, val);
      }
    }
    return root;
  }

  private int getMin(TreeNode root) {
    if (root.left == null) {
      return root.val;
    }
    return getMin(root.left);
  }
}
