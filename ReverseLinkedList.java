class ReverseLinkedList {

  public ListNode reverseList(ListNode head) {
    return reverseList(head, null);
  }

  private ListNode reverseList(ListNode head, ListNode previous) {
    if (head == null) {
      return previous;
    }
    ListNode next = head.next;
    head.next = previous;
    previous = head;
    return reverseList(next, previous);
  }
}
