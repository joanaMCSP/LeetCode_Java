class SpiralMatrix {

  public List<Integer> spiralOrder(int[][] matrix) {
    List<Integer> spiral = new LinkedList<Integer>();

    if (matrix == null || matrix.length == 0) {
      return spiral;
    }

    int m = matrix.length - 1;
    int n = matrix[0].length - 1;
    int startRow = 0, startCol = 0;

    while (startRow <= m && startCol <= n) {
      // top
      for (int j = startCol; j <= n; j++) {
        spiral.add(matrix[startRow][j]);
      }
      // down
      for (int i = startRow + 1; i <= m; i++) {
        spiral.add(matrix[i][n]);
      }
      if (startRow < m && startCol < n) {
        // bottom
        for (int j = n - 1; j >= startCol; j--) {
          spiral.add(matrix[m][j]);
        }
        // left
        for (int i = m - 1; i > startRow; i--) {
          spiral.add(matrix[i][startCol]);
        }
      }

      startRow++;
      startCol++;
      m--;
      n--;
    }
    return spiral;
  }
}
