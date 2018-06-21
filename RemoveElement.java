class RemoveElement {

  public int removeElement(int[] nums, int val) {
    if (nums == null || nums.length == 0) {
      return 0;
    }
    int start = 0;
    int seeker = 0;

    while (seeker < nums.length) {
      if (nums[seeker] == val) {
        seeker++;
        continue;
      } else {
        nums[start] = nums[seeker];
        start++;
      }
      seeker++;
    }
    return start;
  }
}
