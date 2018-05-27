class AverageLevelsBinaryTree {

  public List<Double> averageOfLevels(TreeNode root) {
    List<Double> sum = new ArrayList();
    List<Double> count = new ArrayList();
    List<Double> results = new ArrayList();

    averageDfs(root, 0, sum, count);

    for (int i = 0; i < sum.size(); i++) {
      results.add(i, sum.get(i) / count.get(i));
    }
    return results;
  }

  private void averageDfs(TreeNode root, int level, List<Double> sum, List<Double> count) {
    if (root == null) {
      return;
    }
    if (level < sum.size()) {
      sum.set(level, sum.get(level) + root.val);
      count.set(level, count.get(level) + 1);
    } else {
      sum.add(root.val * 1.0);
      count.add(1.0);
    }
    averageDfs(root.left, level + 1, sum, count);
    averageDfs(root.right, level + 1, sum, count);
  }
}
