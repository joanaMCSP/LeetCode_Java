class SqrtX {

  public int mySqrt(int x) {
    long start = 0;
    long end = x;
    long mid = x;

    while (start <= end) {
      mid = (start + end) / 2;
      long res = mid * mid;
      if (res == x) {
        return (int) mid;
      }
      if (res < x) {
        start = mid + 1;
      } else {
        end = mid - 1;
      }
    }
    return (int) end;
  }
}
