class FindKClosestElements {

  public List<Integer> findClosestElements(int[] arr, int k, int x) {
    List<Integer> closest = new LinkedList<>();
    if (arr.length == 1) {
      closest.add(arr[0]);
      return closest;
    }
    int index = -1;
    int start = 0;
    int end = arr.length - 1;

    index = Arrays.binarySearch(arr, x);

    if (index < 0) {
      index = (-index) - 1;
      if (x < arr[start]) {
        return Arrays.stream(Arrays.copyOfRange(arr, start, k))
            .boxed()
            .collect(Collectors.toList());
      } else if (x > arr[end]) {
        return Arrays.stream(Arrays.copyOfRange(arr, end - k, end))
            .boxed()
            .collect(Collectors.toList());
      }
    }
    start = index - 1;
    end = index;

    while (closest.size() < k) {
      if (start >= 0 && end < arr.length) {
        if (x - arr[start] <= arr[end] - x) {
          closest.add(0, arr[start]);
          start--;
        } else {
          closest.add(arr[end]);
          end++;
        }
      } else if (start >= 0) {
        closest.add(0, arr[start]);
        start--;
      } else if (end <= arr.length) {
        closest.add(arr[end]);
        end++;
      }
    }
    return closest;
  }
}
