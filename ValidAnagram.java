class ValidAnagram {

  public boolean isAnagram(String s, String t) {
    if (s == null || t == null) {
      return false;
    }
    if (s.length() != t.length()) {
      return false;
    }
    Map<Character, Integer> sCounts = new HashMap<>();

    for (int i = 0; i < s.length(); i++) {
      char ch = s.charAt(i);

      if (!sCounts.containsKey(ch)) {
        sCounts.put(ch, 1);
      } else {
        sCounts.put(ch, sCounts.get(ch) + 1);
      }
    }

    for (int i = 0; i < t.length(); i++) {
      char ch = t.charAt(i);
      if (!sCounts.containsKey(ch)) {
        return false;
      }
      sCounts.put(ch, sCounts.get(ch) - 1);
    }

    for (char c : sCounts.keySet()) {
      if (sCounts.get(c) != 0) {
        return false;
      }
    }
    return true;
  }
}
