package org.example;

import java.util.HashMap;
import java.util.Map;

public class Bai275 {
    public static int[] findTwoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (numMap.containsKey(complement)) {
                return new int[]{numMap.get(complement), i};
            }
            numMap.put(nums[i], i);
        }
        return null;
    }

    public static void main(String[] args) {
        int[] nums = {2, 11, 15, 7};
        int target = 9;
        int[] result = findTwoSum(nums, target);

        if (result != null) {
            System.out.println("Vị trí của 2 số có tổng bằng " + target + " là: " + result[0] + " và " + result[1]);
        } else {
            System.out.println("Không tìm thấy 2 số có tổng bằng " + target);
        }
    }
}
