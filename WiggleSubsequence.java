class WiggleSubsequence {

  public int wiggleMaxLength(int[] nums) {
    if (nums == null || nums.length == 0) {
      return 0;
    }
    int[] increasing = new int[nums.length];
    int[] decreasing = new int[nums.length];

    increasing[0] = 1;
    decreasing[0] = 1;
    int longest = 1;

    for (int i = 1; i < nums.length; i++) {
      increasing[i] = 1;
      decreasing[i] = 1;

      for (int j = 0; j < i; j++) {
        if (nums[i] > nums[j]) {
          increasing[i] = Math.max(decreasing[j] + 1, increasing[i]);
        }
        if (nums[i] < nums[j]) {
          decreasing[i] = Math.max(increasing[j] + 1, decreasing[i]);
        }
        longest = Math.max(longest, Math.max(increasing[i], decreasing[i]));
      }
    }
    return longest;
  }
}
