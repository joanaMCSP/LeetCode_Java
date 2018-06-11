class StrStr {

  public int strStr(String haystack, String needle) {
    if (needle.length() == 0) {
      return 0;
    }

    int length = needle.length();
    for (int i = 0; i <= haystack.length() - length; i++) {
      if (needle.equals(haystack.substring(i, i + length))) {
        return i;
      }
    }
    return -1;
  }
}
