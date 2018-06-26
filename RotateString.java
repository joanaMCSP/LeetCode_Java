class RotateString {

  public boolean rotateString(String A, String B) {
    if (A == null && B == null) {
      return true;
    }
    if (A.length() != B.length()) {
      return false;
    }
    if (A.length() == 0) {
      return true;
    }
    B += B;
    return B.contains(A);
  }
}
