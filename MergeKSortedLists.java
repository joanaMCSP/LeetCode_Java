class MergeKSortedLists {

  public ListNode mergeKLists(ListNode[] lists) {
    if (lists == null || lists.length == 0) {
      return null;
    }
    ArrayList<ListNode> merged = new ArrayList<ListNode>();

    for (int i = 0; i < lists.length - 1; i += 2) {
      merged.add(mergeTwoLists(lists[i], lists[i + 1]));
    }
    if (lists.length % 2 != 0) {
      merged.add(lists[lists.length - 1]);
    }
    while (merged.size() > 1) {
      merged.add(mergeTwoLists(merged.remove(0), merged.remove(0)));
    }
    return merged.remove(0);
  }

  private ListNode mergeTwoLists(ListNode l1, ListNode l2) {

    if (l1 == null) {
      return l2;
    }
    if (l2 == null) {
      return l1;
    }
    ListNode root = new ListNode(0);
    ListNode current = root;

    while (l1 != null && l2 != null) {
      if (l1.val < l2.val) {
        current.next = l1;
        l1 = l1.next;
      } else {
        current.next = l2;
        l2 = l2.next;
      }
      current = current.next;
    }
    current.next = l1 != null ? l1 : l2;
    return root.next;
  }
}
