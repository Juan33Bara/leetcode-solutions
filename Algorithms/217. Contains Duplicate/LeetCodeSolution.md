# Solution 1 Approach **Using HashMap**
- This solution is fully functional but not optimized, because it uses an unnecessary loop to check for duplicates after counting frequencies.

# Solution 1 Complexity
- Time complexity: O(2n) in worst case. Simplified to O(n).
  - 38 ms ; Beats ~5 %
- Space complexity: O(n) in the worst case, when all elements are unique.



# Solution 1 Code
```java []
// Solution using HashMap but optimized to return early
import java.util.HashMap;
import java.util.Map;
public class Solution1 {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer , Integer> freq = new HashMap<>();
        for (int i = 0; i < nums.length ; i++) {
            int num = nums[i];
            freq.put(num, freq.getOrDefault(num, 0)+1);
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
```
---
# Solution 2 Approach **Using HashMap but with removing an unnecessary loop**
- This solution is functionally the same as Solution 1 but removes the unnecessary loop to check for duplicates after counting frequencies. 
- It returns true as soon as a duplicate is found during the counting process.
- This solution improves the runtime efficiency from O(2n) to O(n) in the average case.

# Solution 2 Complexity
- Time complexity: O(n) in average case
  - 26 ms ; Beats ~7 %. Because this solution uses early return, it performs better in practice.
- Space complexity: O(n) in the worst case, when all elements are unique.



# Solution 2 Code
```java []
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
```
---
# Solution 3 Approach **Using HashSet** (Left)


# Solution 3 Complexity
- Time complexity:


- Space complexity:


# Solution 3 Code
```java []

```
---
![baby.png](https://assets.leetcode.com/users/images/89eae079-edb7-42a7-a783-4e937f9167ff_1770162141.1684864.png)

