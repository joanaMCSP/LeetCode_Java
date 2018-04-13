class BinaryTreeInorderTraversal {

  public List<Integer> inorderTraversal(TreeNode root) {
    List<Integer> orderedNodes = new LinkedList<>();
    if (root == null) {
      return orderedNodes;
    }
    Stack<TreeNode> toProcess = new Stack<>();
    boolean backwards = false;
    TreeNode current = root;
    toProcess.add(root);

    while (!toProcess.empty()) {
      if (current.left != null && !backwards) {
        toProcess.push(current);
        current = current.left;
      } else {
        backwards = false;
        orderedNodes.add(current.val);
        if (current.right != null) {
          current = current.right;
        } else {
          backwards = true;
          current = toProcess.pop();
        }
      }
    }
    return orderedNodes;
  }
}
