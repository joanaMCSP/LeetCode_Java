class AddTwoNumbers {

  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    if (l1 == null) {
      return l2;
    }
    if (l2 == null) {
      return l1;
    }
    ListNode n = new ListNode(-1);
    ListNode curr = n;
    int sum = 0;
    int carry = 0;

    while (l1 != null || l2 != null) {
      if (l1 != null) {
        sum += l1.val;
        l1 = l1.next;
      }
      if (l2 != null) {
        sum += l2.val;
        l2 = l2.next;
      }
      sum += carry;

      if (sum >= 10) {
        sum = sum % 10;
        carry = 1;
      } else {
        carry = 0;
      }
      curr.next = new ListNode(sum);
      sum = 0;
      curr = curr.next;
    }
    if (carry > 0) curr.next = new ListNode(carry);
    return n.next;
  }
}
