class Permutations {

  public List<List<Integer>> permute(int[] nums) {
    List<List<Integer>> results = new LinkedList();
    if (nums == null || nums.length == 0) {
      return results;
    }
    permuteHelper(nums, 0, results);
    return results;
  }

  private void permuteHelper(int[] nums, int start, List<List<Integer>> results) {
    if (start >= nums.length) {
      results.add(listFromArray(nums));
      return;
    }
    for (int i = start; i < nums.length; i++) {
      swap(nums, start, i);
      permuteHelper(nums, start + 1, results);
      swap(nums, start, i);
    }
  }

  private void swap(int[] numbers, int a, int b) {
    int temp = numbers[a];
    numbers[a] = numbers[b];
    numbers[b] = temp;
  }

  private List<Integer> listFromArray(int[] a) {
    List<Integer> list = new LinkedList();
    for (int i = 0; i < a.length; i++) {
      list.add(a[i]);
    }
    return list;
  }
}
