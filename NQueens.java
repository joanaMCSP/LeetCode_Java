class NQueens {

  public List<List<String>> solveNQueens(int n) {
    List<List<String>> solutions = new LinkedList();
    if (n == 0) {
      return solutions;
    }
    int[] chosen = new int[n];
    solveNQueensHelper(n, solutions, 0, chosen);
    return solutions;
  }

  private void solveNQueensHelper(int n, List<List<String>> solutions, int column, int[] chosen) {
    if (column == n) {
      List<String> solution = drawBoard(chosen, n);
      solutions.add(solution);
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

  private List<String> drawBoard(int[] chosen, int n) {
    List<String> solution = new LinkedList();
    String line = null;
    for (int i = 0; i < n; i++) {
      line = "";
      for (int j = 0; j < n; j++) {
        if (j == chosen[i]) {
          line += "Q";
        } else {
          line += ".";
        }
      }
      solution.add(line);
    }
    return solution;
  }
}
