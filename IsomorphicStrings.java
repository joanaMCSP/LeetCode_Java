class IsomorphicStrings {

  public boolean isIsomorphic(String s, String t) {
    if (s.length() <= 1) {
      return true;
    }
    Map<Character, Character> map = new HashMap<>();

    for (int i = 0; i < s.length(); i++) {
      char curr = s.charAt(i);
      if (!map.containsKey(curr)) {
        if (map.containsValue(t.charAt(i))) {
          return false;
        }
        map.put(curr, t.charAt(i));
      } else {
        if (map.get(curr) != t.charAt(i)) {
          return false;
        }
      }
    }
    return true;
  }
}
