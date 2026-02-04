// Solution using HashMap but optimized to return early
import java.util.HashMap;
import java.util.Map;
public class Solution1 {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer , Integer> freq = new HashMap<>();
        for (int i = 0; i < nums.length ; i++) {
            int num = nums[i];
            freq.put(num, freq.getOrDefault(num, 0)+1);
            if (freq.get(num) > 1){
                return true;
            }
            }
        
        // Iterate over values. FOR EACH LOOP
        for (Integer count : freq.values()){
            if (count >= 2){
                return true;
            }
        }
    return false;


    }
}