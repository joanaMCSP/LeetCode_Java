class MinimumWindowSubstring {

  public String minWindow(String s, String t) {
    if (s == null || t == null) {
      return "";
    }
    Map<Character, Integer> letters = new HashMap<Character, Integer>();

    for (int i = 0; i < t.length(); i++) {
      char ch = t.charAt(i);
      if (!letters.containsKey(ch)) {
        letters.put(ch, 1);
      } else {
        letters.put(ch, letters.get(ch) + 1);
      }
    }
    String shortest = s + t;
    int start = 0;
    int end = 0;
    int count = letters.size();

    while (end < s.length()) {
      char curr = s.charAt(end);
      if (letters.containsKey(curr)) {
        letters.put(curr, letters.get(curr) - 1);
        if (letters.get(curr) == 0) {
          count--;
        }
      }
      while (count == 0) {
        char chstart = s.charAt(start);
        if (letters.containsKey(chstart)) {
          letters.put(chstart, letters.get(chstart) + 1);
          if (letters.get(chstart) > 0) {
            if (end - start + 1 < shortest.length()) {
              shortest = s.substring(start, end + 1);
            }
            count++;
          }
        }
        start++;
      }
      end++;
    }
    return shortest.equals(s + t) ? "" : shortest;
  }
}
