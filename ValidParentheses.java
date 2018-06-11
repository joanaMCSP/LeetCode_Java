class ValidParentheses {

  public boolean isValid(String s) {
    if (s == null || s.length() == 0) {
      return true;
    }
    Stack<Character> opening = new Stack();

    for (int i = 0; i < s.length(); i++) {
      char curr = s.charAt(i);
      if (isOpeningBracket(curr)) {
        opening.push(curr);
      } else {
        if (opening.size() == 0 || !isMatch(opening.pop(), curr)) {
          return false;
        }
      }
    }
    return opening.size() == 0;
  }

  private boolean isOpeningBracket(char c) {
    return c == '(' || c == '[' || c == '{';
  }

  private boolean isMatch(char opening, char closing) {
    return opening == '(' && closing == ')'
        || opening == '[' && closing == ']'
        || opening == '{' && closing == '}';
  }
}
