class ReverseWordsInStringIII {

  public String reverseWords(String s) {
    if (s == null || s.length() == 0) {
      return s;
    }
    String[] words = s.split(" ");
    String[] reversed = new String[words.length];
    StringBuilder w = null;

    for (int i = 0; i < words.length; i++) {
      w = new StringBuilder(words[i]);
      reversed[i] = w.reverse().toString();
    }
    return String.join(" ", reversed);
  }
}
