class NonOverlappingIntervals {

  public int eraseOverlapIntervals(Interval[] intervals) {
    if (intervals.length == 0) {
      return 0;
    }
    int count = 1;
    Arrays.sort(intervals, (a, b) -> a.end - b.end);
    int end = intervals[0].end;

    for (int i = 1; i < intervals.length; i++) {
      if (!isOverlapping(intervals[i], end)) {
        count++;
        end = intervals[i].end;
      }
    }
    return intervals.length - count;
  }

  private boolean isOverlapping(Interval a, int end) {
    return a.start < end;
  }
}
