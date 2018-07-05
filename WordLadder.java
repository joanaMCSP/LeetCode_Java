class WordLadder {

  public int ladderLength(String beginWord, String endWord, List<String> wordList) {
    Queue<String> q = new LinkedList();
    Set<String> visited = new HashSet<>();
    q.add(beginWord);
    int path = 0;

    while (q.size() > 0) {
      Queue<String> level = new LinkedList();

      while (q.size() > 0) {
        String s = q.poll();
        if (!visited.contains(s)) {
          visited.add(s);
          if (s.equals(endWord)) {
            return path + 1;
          }
          for (int i = 0; i < wordList.size(); i++) {
            if (oneCharDifference(s, wordList.get(i))) {
              level.add(wordList.get(i));
            }
          }
        }
      }
      q.addAll(level);
      level.clear();
      path++;
    }
    return 0;
  }

  private boolean oneCharDifference(String w1, String w2) {
    int diff = 0;

    for (int i = 0; i < w1.length(); i++) {
      if (w1.charAt(i) != w2.charAt(i)) {
        diff++;
      }
    }
    return diff <= 1;
  }
}
