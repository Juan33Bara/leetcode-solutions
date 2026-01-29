// HashMap solution
import java.util.HashMap;

class Solution3 {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer , Integer> map = new HashMap<>(); // number -> index
        for (int i = 0 ; i < nums.length ; i++){

            int complement = target - nums[i];

            // Have i already seen the number I need to reach the target?
            if (map.containsKey(complement)){
                return new int[] { map.get(complement), i};

            }

            // If the map does not contain the number i need to reach target, i add that number
            map.put(nums[i] , i );

        }
        return new int[2];
    }
}
