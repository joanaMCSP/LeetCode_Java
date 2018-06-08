class BinaryTreeLevelOrderTraversalII {

  public List<List<Integer>> levelOrderBottom(TreeNode root) {
    List<List<Integer>> res = new LinkedList();
    if (root == null) {
      return res;
    }
    Queue<TreeNode> q = new LinkedList();
    q.add(root);

    while (q.size() > 0) {
      List<Integer> vals = new LinkedList();
      Queue<TreeNode> level = new LinkedList();

      while (q.size() > 0) {
        TreeNode n = q.poll();
        if (n.left != null) {
          level.add(n.left);
        }
        if (n.right != null) {
          level.add(n.right);
        }
        vals.add(n.val);
      }
      res.add(0, vals);
      q = new LinkedList(level);
    }
    return res;
  }
}
