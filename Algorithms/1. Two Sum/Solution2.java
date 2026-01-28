// HashMap solution
import java.util.HashMap;

class Solution2 {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>(); // number -> index

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            // If we've seen the complement before, we found the answer
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }

            // Otherwise, remember the current number and its index
            map.put(nums[i], i);
        }

        return new int[2]; // fallback (LeetCode guarantees a solution)
    }
}
