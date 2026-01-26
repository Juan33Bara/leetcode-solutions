# Solution 1 Approach
<!-- Describe your approach to solving the problem. -->
- Using a brute-force approach

# Solution 1 Complexity
- Time complexity: O(n*n)
    - 89 ms
    - Beats: 5.48% 
    

- Space complexity: O(2) = O(1)
    - 46.87 MB
    - Beats: 76.22% 


# Code
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

// Time complexity: O(n*n)
// Space complexity: O(2) = O(1)
```

---
# Solution 2 Approach

# Solution 2 Complexity
- Time complexity:


- Space complexity:


# Solution 2 Code
```java []

class Solution {
    public int[] twoSum(int[] nums, int target) {

    }
}

// Time complexity: O(n*n)
// Space complexity: O(2) = O(1)
```
