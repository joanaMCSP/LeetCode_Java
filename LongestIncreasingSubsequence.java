class LongestIncreasingSubsequence {
  public int lengthOfLIS(int[] nums) {
    if (nums.length == 0) {
      return 0;
    }

    int[] longest = new int[nums.length];
    longest[0] = 1;
    int max = 1;

    for (int i = 1; i < nums.length; i++) {
      longest[i] = 1;
      for (int j = 0; j < i; j++) {
        if (nums[i] > nums[j]) {
          longest[i] = Math.max(longest[j] + 1, longest[i]);
        }
      }
      max = Math.max(max, longest[i]);
    }
    return max;
  }
}
