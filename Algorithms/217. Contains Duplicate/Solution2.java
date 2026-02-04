// Solution using HashMap but optimized to return early 
import java.util.HashMap;
import java.util.Map;
public class Solution2 {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer , Integer> freq = new HashMap<>();
        for (int i = 0; i < nums.length ; i++) {
            int num = nums[i];
            freq.put(num, freq.getOrDefault(num, 0)+1);
            // Early return if duplicate found (Its checked here and not in a separate loop (worse runtime performance))
            if (freq.get(num) > 1){
                return true;
            }
            }
    return false;


    }
}