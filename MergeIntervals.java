public class MergeIntervals {

  public List<Interval> merge(List<Interval> intervals) {
    intervals.sort(new IntervalComparator());

    for (int i = 0; i < intervals.size() - 1; i++) {
      Interval curr = intervals.get(i);
      Interval next = intervals.get(i + 1);
      if (curr.start <= next.end && next.start <= curr.end) {
        intervals.remove(i);
        intervals.remove(i);
        intervals.add(
            i, new Interval(Math.min(curr.start, next.start), Math.max(curr.end, next.end)));
        i--;
      }
    }
    return intervals;
  }
}

class IntervalComparator implements Comparator<Interval> {

  public int compare(Interval a, Interval b) {
    return a.start - b.start;
  }
}
