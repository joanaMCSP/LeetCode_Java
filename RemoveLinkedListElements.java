class RemoveLinkedListElements {

  public ListNode removeElements(ListNode head, int val) {
    if (head == null) {
      return null;
    }

    ListNode curr = head;

    while (curr.next != null) {
      if (curr.next.val == val) {
        curr.next = curr.next.next;
      } else {
        curr = curr.next;
      }
    }
    return head.val == val ? head.next : head;
  }
}
