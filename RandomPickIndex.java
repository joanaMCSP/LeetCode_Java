class RandomPickIndex {

  Map<Integer, List<Integer>> numMap = new HashMap();
  Random rand = new Random();

  public Solution(int[] nums) {
    for (int i = 0; i < nums.length; i++) {
      int n = nums[i];
      if (!numMap.containsKey(n)) {
        List<Integer> vals = new ArrayList();
        vals.add(i);
        numMap.put(n, vals);
      } else {
        numMap.get(n).add(i);
      }
    }
  }

  public int pick(int target) {
    List<Integer> vals = numMap.get(target);
    int index = rand.nextInt(vals.size());
    return vals.get(index);
  }
}
