class FindRightInterval {

  public int[] findRightInterval(Interval[] intervals) {
    if (intervals.length == 0) {
      return new int[] {};
    }
    if (intervals.length == 1) {
      return new int[] {-1};
    }
    Map<Integer, Integer> startPoints = new HashMap<>();
    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;

    for (int i = 0; i < intervals.length; i++) {
      min = intervals[i].start < min ? intervals[i].start : min;
      max = intervals[i].start > max ? intervals[i].start : max;
      startPoints.put(intervals[i].start, i);
    }
    int[] indices = new int[intervals.length];

    for (int i = 0; i < intervals.length; i++) {
      int end = intervals[i].end;

      if (end <= min) {
        indices[i] = startPoints.get(min);
      } else if (end > max) {
        indices[i] = -1;
      } else {
        indices[i] = -1;
        while (end <= max) {
          if (startPoints.containsKey(end)) {
            indices[i] = startPoints.get(end);
            break;
          }
          end++;
        }
      }
    }
    return indices;
  }
}
