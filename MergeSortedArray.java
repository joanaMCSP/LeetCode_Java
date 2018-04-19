class MergeSortedArray {

  public void merge(int[] nums1, int m, int[] nums2, int n) {
    int end1 = m - 1;
    int end2 = n - 1;
    int end = nums1.length - 1;

    while (end2 >= 0) {
      if (end1 >= 0 && nums1[end1] > nums2[end2]) {
        nums1[end] = nums1[end1];
        end1--;
      } else {
        nums1[end] = nums2[end2];
        end2--;
      }
      end--;
    }
  }
}
