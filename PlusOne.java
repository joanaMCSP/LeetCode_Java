class PlusOne {

  public int[] plusOne(int[] digits) {
    if (digits == null || digits.length == 0) {
      return new int[] {1};
    }
    int carry = 0;

    for (int i = digits.length - 1; i >= 0; i--) {
      int sum = 0;
      if (i == digits.length - 1) {
        sum = digits[i] + 1;
      } else {
        sum = digits[i] + carry;
        carry = 0;
      }
      if (sum >= 10) {
        digits[i] = 0;
        carry = 1;
      } else {
        digits[i] = sum;
      }
    }

    if (carry > 0) {
      int[] results = new int[digits.length + 1];
      results[0] = 1;
      return results;
    }
    return digits;
  }
}
