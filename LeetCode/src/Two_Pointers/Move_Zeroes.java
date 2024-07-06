package Two_Pointers;

public class Move_Zeroes {
}

class Solution {
    public void moveZeroes(int[] nums) {
        int tmp, left = 0;

        for (int right = 0; right < nums.length; right++) {
            if (nums[right] != 0) {
                tmp = nums[right];
                nums[right] = nums[left];
                nums[left] = tmp;
                left++;
            }
        }
    }
}