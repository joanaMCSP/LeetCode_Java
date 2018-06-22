class RotateArray {

  public void rotate(int[] nums, int k) {
    if (nums == null || nums.length < 2) {
      return;
    }

    int[] rotated = new int[nums.length];

    for (int i = 0; i < rotated.length; i++) {
      rotated[i] = nums[(nums.length - (k % nums.length) + i) % nums.length];
    }

    for (int i = 0; i < nums.length; i++) {
      nums[i] = rotated[i];
    }
  }
}
