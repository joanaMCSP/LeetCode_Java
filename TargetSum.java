class TargetSum {

  public int findTargetSumWays(int[] nums, int S) {
    int offset = 0;
    for (int num : nums) {
      offset += num;
    }
    if (S > offset) {
      return 0;
    }

    int[][] cache = new int[nums.length + 1][2 * offset + 1];

    cache[0][offset] = 1;

    for (int i = 1; i <= nums.length; i++) {
      for (int j = 0; j < 2 * offset + 1; j++) {
        int previous = cache[i - 1][j];
        if (previous > 0) {
          cache[i][j + nums[i - 1]] += previous;
          cache[i][j - nums[i - 1]] += previous;
        }
      }
    }
    return cache[nums.length][S + offset];
  }
}
