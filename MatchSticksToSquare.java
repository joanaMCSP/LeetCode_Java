class MatchSticksToSquare {

  public boolean makesquare(int[] nums) {
    if (nums == null || nums.length == 0 || nums.length < 4) {
      return false;
    }

    int totalSum = 0;
    for (int num : nums) {
      totalSum += num;
    }
    if (totalSum % 4 != 0) {
      return false;
    }
    int side = totalSum / 4;

    return canMakeSquare(nums, new int[4], 0, side);
  }

  private boolean canMakeSquare(int[] nums, int[] totals, int index, int target) {
    if (index == nums.length) {
      return true;
    }
    for (int i = 0; i < totals.length; i++) {
      int sum = totals[i] + nums[index];
      if (sum > target) {
        continue;
      }
      totals[i] += nums[index];
      if (canMakeSquare(nums, totals, index + 1, target)) {
        return true;
      }
      totals[i] -= nums[index];
    }
    return false;
  }
}
