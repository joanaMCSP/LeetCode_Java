class RotateImage {

  public void rotate(int[][] matrix) {
    int temp = 0;
    int n = matrix.length;

    for (int layer = 0; layer < n / 2; layer++) {
      for (int i = layer; i < n - 1 - layer; i++) {
        temp = matrix[layer][i];
        matrix[layer][i] = matrix[n - 1 - i][layer];
        matrix[n - 1 - i][layer] = matrix[n - 1 - layer][n - 1 - i];
        matrix[n - 1 - layer][n - 1 - i] = matrix[i][n - 1 - layer];
        matrix[i][n - 1 - layer] = temp;
      }
    }
  }
}
