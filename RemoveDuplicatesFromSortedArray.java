class RemoveDuplicatesFromSortedArray {

  public int removeDuplicates(int[] nums) {
    if (nums == null || nums.length == 0) {
      return 0;
    }
    if (nums.length < 2) {
      return 1;
    }

    int start = 0;
    int end = 1;

    while (end < nums.length) {
      if (nums[start] == nums[end]) {
        end++;
      } else {
        start++;
        nums[start] = nums[end];
      }
    }
    return start + 1;
  }
}
