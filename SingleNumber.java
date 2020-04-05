class SingleNumber {
    public int singleNumber(int[] nums) {
       Set<Integer> seen = new HashSet<>();
        for (int num : nums) {
            if (!seen.contains(num)) {
                seen.add(num);
            } else {
                seen.remove(num);
            }
        }
        return seen.stream().collect(Collectors.toList()).get(0);
    }
}
