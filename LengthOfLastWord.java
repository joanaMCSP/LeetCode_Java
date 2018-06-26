class LengthOfLastWord {

  public int lengthOfLastWord(String s) {
    if (s == null || s.length() == 0) {
      return 0;
    }
    s = s.trim();

    String[] words = s.split(" ");
    return words[words.length - 1].length();
  }
}
