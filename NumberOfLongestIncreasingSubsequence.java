class NumberOfLongestIncreasingSubsequence {

  public int findNumberOfLIS(int[] nums) {
    if (nums == null || nums.length == 0) {
      return 0;
    }

    int[] longest = new int[nums.length];
    int[] counts = new int[nums.length];

    for (int i = 0; i < nums.length; i++) {
      longest[i] = 1;
      counts[i] = 1;
      for (int j = 0; j < i; j++) {
        if (nums[i] > nums[j]) {
          if (longest[j] + 1 > longest[i]) {
            longest[i] = longest[j] + 1;
            counts[i] = counts[j];
          } else if (longest[j] + 1 == longest[i]) {
            counts[i] += counts[j];
          }
        }
      }
    }

    int max = 0;
    int count = 0;

    for (int n : longest) {
      max = max > n ? max : n;
    }

    for (int i = 0; i < longest.length; i++) {
      if (longest[i] == max) {
        count += counts[i];
      }
    }

    return count;
  }
}
