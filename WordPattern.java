class WordPattern {

  public boolean wordPattern(String pattern, String str) {
    String[] words = str.split(" ");
    if (pattern.length() != words.length) {
      return false;
    }
    Map<Character, String> patternWord = new HashMap<>();

    for (int i = 0; i < words.length; i++) {
      if (!patternWord.containsKey(pattern.charAt(i))) {
        if (!patternWord.containsValue(words[i])) {
          patternWord.put(pattern.charAt(i), words[i]);
        } else {
          return false;
        }
      } else {
        if (!words[i].equals(patternWord.get(pattern.charAt(i)))) {
          return false;
        }
      }
    }
    return true;
  }
}
