package hundred_days.first_day;

public class RemoveElement {
    public static void main(String[] args) {
        int[] nums = { 3, 2, 2, 3 };
        int val = 3;
        int length = removeElement(nums, val);
        System.out.println(length);
    }

    //https://leetcode.com/problems/remove-element
    public static int removeElement(int[] nums, int val) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }
}