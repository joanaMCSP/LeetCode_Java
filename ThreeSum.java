class ThreeSum {

  public List<List<Integer>> threeSum(int[] nums) {
    List<List<Integer>> result = new LinkedList<List<Integer>>();

    if (nums == null || nums.length < 3) {
      return result;
    }
    Arrays.sort(nums);
    int sum = -1;

    for (int i = 0; i <= nums.length - 3; i++) {
      int start = i + 1;
      int end = nums.length - 1;

      if (i == 0 || nums[i - 1] < nums[i]) {
        while (start < end) {
          sum = nums[i] + nums[start] + nums[end];
          if (sum == 0) {
            List<Integer> found = new LinkedList<Integer>();
            found.add(nums[i]);
            found.add(nums[start]);
            found.add(nums[end]);
            result.add(found);
            start++;
            end--;

            while (start < end && nums[start - 1] == nums[start]) {
              start++;
            }
            while (start < end && nums[end + 1] == nums[end]) {
              end--;
            }
          } else if (sum < 0) {
            start++;
          } else {
            end--;
          }
        }
      }
    }
    return result;
  }
}
