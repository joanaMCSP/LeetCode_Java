class SubSets {

  public List<List<Integer>> subsets(int[] nums) {
    List<List<Integer>> total_permutations = new ArrayList<List<Integer>>();
    total_permutations.add(new ArrayList<Integer>());

    if (nums != null && nums.length != 0) {
      permutations(nums, 0, total_permutations);
    }
    return total_permutations;
  }

  public void permutations(int[] nums, int index, List<List<Integer>> total_permutations) {
    if (index == nums.length - 1) {
      ArrayList<Integer> num = new ArrayList<Integer>();
      num.add(nums[index]);
      total_permutations.add(num);
      return;
    }
    int current = nums[index];
    permutations(nums, index + 1, total_permutations);
    List<List<Integer>> currentPermutations = new ArrayList<List<Integer>>();

    for (List<Integer> permutation : total_permutations) {
      List<Integer> currentList = new ArrayList(permutation);
      currentList.add(current);
      currentPermutations.add(currentList);
    }

    for (List<Integer> currentPermutation : currentPermutations) {
      total_permutations.add(currentPermutation);
    }
  }
}
