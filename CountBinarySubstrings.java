class CountBinarySubstrings {

  public int countBinarySubstrings(String s) {
    int count = 0;

    for (int i = 0; i < s.length() - 1; i++) {
      if (s.charAt(i) != s.charAt(i + 1)) {
        count++;
        int start = i;
        int end = i + 1;

        while (start > 0 && end < s.length() - 1) {
          start--;
          end++;
          if (s.charAt(start) == s.charAt(i) && s.charAt(end) == s.charAt(i + 1)) {
            count++;
          } else {
            break;
          }
        }
      }
    }
    return count;
  }
}
