# Solution 1 Approach **ARRAY SOLUTION (Brute Force)**
<!-- Describe your approach to solving the problem. -->
- Use two nested loops to check all pairs of indices **(i, j)**, , including duplicate pairs like (i, j) and (j, i).
- If **i != j** and the sum of the two numbers is equal to the target, return an array with the indices.
- This works because it tries every possible pair, but it's slow for large **n**.
- The condition i != j is required because the inner loop starts at j = 0.

# Solution 1 Complexity **ARRAY SOLUTION**
- Time complexity: O(n*n) = O(n²)
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
# Solution 2 Approach **Array solution better than solution 1**
- Start the inner loop at j = i + 1 to avoid checking duplicate pairs and eliminate the need for **i != j**.

# Solution 2 Complexity **ARRAY SOLUTION**
- Time complexity: O(n²)  (more precisely n(n−1)/2 comparisons)
    - 44 ms
    - Beats: 27.84% 
    

- Space complexity: O(2) = O(1)
    - 47.14 MB
    - Beats: 48.06% 


# Solution 2 Code **ARRAY SOLUTION**
```java []
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if ( (nums[i] + nums[j] == target)){
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
# Solution 3 Approach **HashMap solution**
- Use a **HashMap** to store value -> index for numbers seen so far.
- For each number **nums[i]**, compute **complement = target - nums[i]**.
- Otherwise, store the current number and index in the map.
- This is fast because the algorithm iterates once over the array (n iterations) and each HashMap operation is O(1) on average.
- First check and then put, so never use the same index twice (important when duplicates exist).
  
# Solution 3 Complexity **HashMap solution**
- Time complexity: O(n)
    - 2 ms
    - Beats: 99.14%


- Space complexity: O(n + 2) = O(n), where n is the HashMap size and 2 is the fixed-size result array.
    - 46.89 MB
    - Beats: 77.46%

# Solution 3 Code **HashMap solution**
```java []
// HashMap solution
import java.util.HashMap;

class Solution {
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

```
---
![baby.png](https://assets.leetcode.com/users/images/e7d1fce7-fff3-46f5-8f09-b74fd2397b09_1769644187.8613663.png)

