class ZigZagConversion {

  public String convert(String s, int numRows) {
    int wrap = 2 * (numRows - 1);

    if (numRows == 0 || numRows == 1) {
      return s;
    }
    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < numRows; i++) {
      for (int j = 0; j + i < s.length(); j += wrap) {
        sb.append(s.charAt(j + i));
        if (i > 0 && i < numRows - 1 && j + wrap - i < s.length()) {
          sb.append(s.charAt(j + wrap - i));
        }
      }
    }
    return sb.toString();
  }
}
