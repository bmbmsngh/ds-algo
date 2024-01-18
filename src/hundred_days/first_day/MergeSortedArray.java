package hundred_days.first_day;

import java.util.Arrays;

class MergeSortedArray {

    // https://leetcode.com/problems/merge-sorted-array
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int total = m + n - 1;
        while (j >= 0) {
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[total--] = nums1[i--];
            } else {
                nums1[total--] = nums2[j--];
            }
        }
    }

    public static void main(String[] args) {
        // case 1
        int[] nums1 = new int[] { 1, 2, 3, 0, 0, 0 };
        int m = 3;
        int[] nums2 = new int[] { 2, 5, 6 };
        int n = 3;

        merge(nums1, m, nums2, n);
        System.out.println("CASE 1 => " + Arrays.toString(nums1));

        // case 2
        nums1 = new int[] { 1 };
        m = 1;
        nums2 = new int[] {};
        n = 0;

        merge(nums1, m, nums2, n);
        System.out.println("CASE 2 => " + Arrays.toString(nums1));

        // case 3
        nums1 = new int[] { 0 };
        m = 0;
        nums2 = new int[] { 1 };
        n = 1;
        merge(nums1, m, nums2, n);
        System.out.println("CASE 3 => " + Arrays.toString(nums1));
    }
}