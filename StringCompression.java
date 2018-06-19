class StringCompression {

  public int compress(char[] chars) {
    int lastIndex = 0;
    int count = 1;

    if (chars.length == 0 || chars.length == 1) {
      return chars.length;
    }

    for (int i = 0; i < chars.length; i++) {
      char ch = chars[i];
      if (i < chars.length - 1 && ch == chars[i + 1]) {
        count++;
        continue;
      }
      chars[lastIndex] = ch;
      lastIndex++;
      if (count > 1 && count < 10) {
        chars[lastIndex] = (char) (count + '0');
        lastIndex++;
      }
      if (count >= 10) {
        String currCount = count + "";
        for (int j = 0; j < currCount.length(); j++) {
          chars[lastIndex] = currCount.charAt(j);
          lastIndex++;
        }
      }
      count = 1;
    }
    return lastIndex;
  }
}
