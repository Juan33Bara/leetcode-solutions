import java.util.HashMap;
import java.util.Map;
public class Solution1 {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer , Integer> freq = new HashMap<>();
        for (int i = 0; i < nums.length ; i++) {
            freq.put(nums[i], freq.getOrDefault(nums[i], 0)+1);
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