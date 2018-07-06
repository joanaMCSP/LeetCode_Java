class RotateFunction {

  public int maxRotateFunction(int[] A) {
    if (A.length <= 1) {
      return 0;
    }
    int sum = 0;
    int f = 0;

    for (int i = 0; i < A.length; i++) {
      sum += A[i];
      f += A[i] * i;
    }
    int max = Integer.MIN_VALUE;

    for (int i = 0; i < A.length; i++) {
      f = f + A.length * A[i] - sum;
      max = Math.max(f, max);
    }
    return max;
  }
}
