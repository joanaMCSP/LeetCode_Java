class ReverseStringII {

  public String reverseStr(String s, int k) {
    if (s.length() <= k) {
      return new StringBuilder(s).reverse().toString();
    }
    if (s.length() <= 2 * k) {
      return reverseStr(s.substring(0, k), k) + s.substring(k, s.length());
    }
    return reverseStr(s.substring(0, 2 * k), k) + reverseStr(s.substring(2 * k, s.length()), k);
  }
}
