class FindAllAnagramsInString {

  public List<Integer> findAnagrams(String s, String p) {
    List<Integer> results = new LinkedList();
    if (s == null || s.length() == 0 || s.length() < p.length()) {
      return results;
    }

    int[] chars = new int[26];
    int[] charWindow = new int[26];

    for (int i = 0; i < p.length(); i++) {
      chars[p.charAt(i) - 'a']++;
      charWindow[s.charAt(i) - 'a']++;
    }

    for (int i = p.length(); i < s.length(); i++) {
      if (compareArrays(chars, charWindow)) {
        results.add(i - p.length());
      }
      charWindow[s.charAt(i) - 'a']++;
      charWindow[s.charAt(i - p.length()) - 'a']--;
    }
    if (compareArrays(chars, charWindow)) results.add(s.length() - p.length());
    return results;
  }

  private boolean compareArrays(int[] a, int[] b) {
    for (int i = 0; i < a.length; i++) {
      if (a[i] != b[i]) return false;
    }
    return true;
  }
}
