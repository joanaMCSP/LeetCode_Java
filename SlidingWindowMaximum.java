class SlidingWindowMaximum {

  public int[] maxSlidingWindow(int[] nums, int k) {
    List<Integer> maxes = new ArrayList<>();
    if (nums.length == 0) {
      return new int[] {};
    }
    Deque<Integer> indexes = new LinkedList<>();
    int n = nums.length;

    for (int i = 0; i < n; i++) {
      if (indexes.size() > 0 && indexes.peekFirst() < (i - k + 1)) {
        indexes.removeFirst();
      }

      while (indexes.peekLast() != null && nums[i] > nums[indexes.peekLast()]) {
        indexes.removeLast();
      }
      indexes.addLast(i);

      if (i >= k - 1) {
        maxes.add(nums[indexes.getFirst()]);
      }
    }
    return maxes.stream().mapToInt(i -> i).toArray();
  }
}
