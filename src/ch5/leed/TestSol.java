package ch5.leed;

import java.util.Arrays;

public class TestSol {
    public static void main(String[] args) {

        int[] nums = new int[]{2,7,11,15};
        int target = 18;

        Solution solution1 = new Solution();
        System.out.println(Arrays.toString(solution1.twoSum(nums, target)));
    }
}
