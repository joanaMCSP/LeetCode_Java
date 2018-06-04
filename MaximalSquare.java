class MaximalSquare {

  public int maximalSquare(char[][] matrix) {
    if (matrix == null || matrix.length == 0) {
      return 0;
    }
    int m = matrix.length;
    int n = matrix[0].length;
    if (n == 0) {
      return 0;
    }
    int[][] squares = new int[m][n];
    int max = 0;
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        if (i == 0 || j == 0) {
          squares[i][j] = matrix[i][j] == '1' ? 1 : 0;
        } else if (matrix[i][j] == '1') {
          squares[i][j] =
              Math.min(Math.min(squares[i][j - 1], squares[i - 1][j]), squares[i - 1][j - 1]) + 1;
        }
        max = max > squares[i][j] ? max : squares[i][j];
      }
    }
    return max * max;
  }
}
