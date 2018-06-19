class Trie {

  TrieNode root;

  private class TrieNode {
    private boolean last;
    private TrieNode[] children;
    private final int size = 26;

    private TrieNode() {
      children = new TrieNode[size];
    }

    void insert(char ch) {
      children[ch - 'a'] = new TrieNode();
    }

    TrieNode find(char ch) {
      return children[ch - 'a'];
    }

    boolean isLast() {
      return last;
    }

    void setLast(boolean last) {
      this.last = last;
    }
  }

  public Trie() {
    root = new TrieNode();
  }

  public void insert(String word) {
    TrieNode curr = root;
    for (int i = 0; i < word.length(); i++) {
      TrieNode n = curr.find(word.charAt(i));
      if (n == null) {
        curr.insert(word.charAt(i));
        n = curr.find(word.charAt(i));
      }
      curr = n;
    }
    curr.setLast(true);
  }

  public boolean search(String word) {
    TrieNode curr = root;
    for (int i = 0; i < word.length(); i++) {
      curr = curr.find(word.charAt(i));
      if (curr == null) {
        return false;
      }
    }
    return curr.isLast();
  }

  public boolean startsWith(String prefix) {
    TrieNode curr = root;
    for (int i = 0; i < prefix.length(); i++) {
      curr = curr.find(prefix.charAt(i));
      if (curr == null) {
        return false;
      }
    }
    return true;
  }
}
