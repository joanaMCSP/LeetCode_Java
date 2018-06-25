class StringToInteger {

  public int myAtoi(String str) {
    if (str == null || str.length() == 0) {
      return 0;
    }
    char sign = '?';
    str = str.trim();
    StringBuilder number = new StringBuilder();

    for (int i = 0; i < str.length(); i++) {
      char ch = str.charAt(i);
      if (isSign(ch) && number.length() == 0) {
        if (i < str.length() - 1 && !isDigit(str.charAt(i + 1))) {
          return 0;
        }
        sign = ch;
      } else if (isDigit(ch)) {
        number.append(ch + "");
      } else {
        break;
      }
    }
    return number.length() > 0 ? processNumber(number.toString(), sign) : 0;
  }

  private int processNumber(String number, char sign) {
    long n = 0;
    int maxDigits = 10;

    for (int i = 0; i < number.length(); i++) {
      String digit = number.charAt(i) + "";
      long next = n * maxDigits + (Integer.parseInt(digit));
      if (sign == '-' && -next <= Integer.MIN_VALUE) {
        n = Integer.MIN_VALUE;
        break;
      } else if (next >= Integer.MAX_VALUE) {
        n = Integer.MAX_VALUE;
        break;
      }
      n *= 10;
      n += Integer.parseInt(digit);
    }
    return sign == '-' ? (int) -n : (int) n;
  }

  private boolean isDigit(char ch) {
    return ch >= '0' && ch <= '9';
  }

  private boolean isSign(char ch) {
    return ch == '+' || ch == '-';
  }
}
