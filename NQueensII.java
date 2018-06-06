class NQueensII {

  public int totalNQueens(int n) {
    List<List<int[]>> solutions = new LinkedList();
    if (n == 0) {
      return 1;
    }
    int[] chosen = new int[n];
    solveNQueensHelper(n, solutions, 0, chosen);
    return solutions.size();
  }

  private void solveNQueensHelper(int n, List<List<int[]>> solutions, int column, int[] chosen) {
    if (column == n) {
      List<int[]> sol = Arrays.asList(chosen);
      solutions.add(sol);
      return;
    }
    for (int row = 0; row < n; row++) {
      if (isSafe(row, column, chosen)) {
        chosen[column] = row;
        solveNQueensHelper(n, solutions, column + 1, chosen);
      }
    }
  }

  private boolean isSafe(int row, int column, int[] chosen) {
    for (int i = 0; i < column; i++) {
      int previous = chosen[i];
      if (previous == row || previous == row - (column - i) || previous == row + (column - i))
        return false;
    }
    return true;
  }
}
