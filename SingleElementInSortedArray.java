class SingleElementInSortedArray {

  public int singleNonDuplicate(int[] nums) {
    if (nums == null || nums.length == 0) {
      return 0;
    }
    return singleNonDuplicate(nums, 0, nums.length - 1);
  }

  private int singleNonDuplicate(int[] nums, int start, int end) {
    int mid = (start + end) / 2;
    if (start >= end) {
      return nums[start];
    }
    if (mid % 2 != 0) {
      mid--;
    }
    if (nums[mid] != nums[mid + 1]) {
      return singleNonDuplicate(nums, start, mid);
    }
    return singleNonDuplicate(nums, mid + 2, end);
  }
}
