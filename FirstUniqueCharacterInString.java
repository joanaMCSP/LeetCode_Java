class FirstUniqueCharacterInString {

  public int firstUniqChar(String s) {
    if (s == null) {
      return 0;
    }
    Map<Character, Integer> charMap = new HashMap();

    for (int i = 0; i < s.length(); i++) {
      char ch = s.charAt(i);
      if (!charMap.containsKey(ch)) {
        charMap.put(ch, 1);
      } else {
        charMap.put(ch, charMap.get(ch) + 1);
      }
    }

    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      if (charMap.get(c) == 1) {
        return i;
      }
    }
    return -1;
  }
}
