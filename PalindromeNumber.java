class PalindromeNumber {

  public boolean isPalindrome(int x) {
    if (x < 0) {
      return false;
    }
    int current = x;
    int reverse = 0;
    while (current != 0) {
      reverse *= 10;
      reverse += current % 10;
      current /= 10;
    }
    return x == reverse;
  }
}
