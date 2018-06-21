class SearchInsertPosition {

  public int searchInsert(int[] nums, int target) {
    if (nums == null || nums.length == 0) {
      return 0;
    }
    int start = 0;
    int end = nums.length - 1;
    int mid = (start + end) / 2;

    while (start <= end) {
      if (nums[mid] == target) {
        return mid;
      } else if (nums[mid] > target) {
        end = mid - 1;
      } else {
        start = mid + 1;
      }
      mid = (start + end) / 2;
    }
    return start;
  }
}
