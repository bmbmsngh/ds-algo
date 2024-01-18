package hundred_days.first_day;

public class RemoveDuplicateFromSortedArray {

    //https://leetcode.com/problems/remove-duplicates-from-sorted-array
    private static int removeDuplicates(int[] nums) {
        int i = 0;
        for (int n : nums)
            if (i == 0 || n > nums[i - 1])
                nums[i++] = n;
        return i;
    }

    public static void main(String[] args) {
        int[] nums = new int[] { 1, 1, 2 };
        int r1 = removeDuplicates(nums);
        System.out.println("COUNT => " + r1);

        nums = new int[] { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        r1 = removeDuplicates(nums);
        System.out.println("COUNT => " + r1);
    }
}