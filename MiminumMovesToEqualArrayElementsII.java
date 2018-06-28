class MinimumMovesToEqualArrayElementsII {

  public int minMoves2(int[] nums) {
    if (nums.length == 1) {
      return 0;
    }
    int median = findMedian(nums);
    int minDiff = 0;

    for (int i = 0; i < nums.length; i++) {
      minDiff += Math.abs(nums[i] - median);
    }
    return minDiff;
  }

  private int findMedian(int[] nums) {
    int[] sorted = nums.clone();
    Arrays.sort(sorted);
    int median = 0;

    if (sorted.length % 2 != 0) {
      median = sorted[sorted.length / 2];
    } else {
      median = (sorted[(sorted.length - 1) / 2] + sorted[sorted.length / 2]) / 2;
    }
    return median;
  }
}
