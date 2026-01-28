# Solution 1 Approach **ARRAY SOLUTION**
<!-- Describe your approach to solving the problem. -->
- Using a brute-force approach (due to checks every posible pair (i, j) in the array).

# Solution 1 Complexity **ARRAY SOLUTION**
- Time complexity: O(n*n) = O(n^2)
    - 89 ms
    - Beats: 5.48% 
    

- Space complexity: O(2) = O(1)
    - 46.87 MB
    - Beats: 76.22% 


# Solution 1 Code **ARRAY SOLUTION**
```java []

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if ( (i != j) && (nums[i] + nums[j] == target)){
                    arr[0] = i;
                    arr[1] = j;
                    return arr;
                }
                
            }
            
        }
        return arr;
    }
}

```

---
# Solution 2 Approach **HashMap solution**
- Array solution but more efficient than brute-force (Solution 1).
  
# Solution 2 Complexity **HashMap solution**
- Time complexity: O(n)
    - 2 ms
    - Beats: 99.13%


- Space complexity: O(n)
    - 47.37 MB
    - Beats: 16.64%

# Solution 2 Code **HashMap solution**
```java []
import java.util.HashMap;

class Solution {
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

```
