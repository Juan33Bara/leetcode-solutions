# Approach
<!-- Describe your approach to solving the problem. -->
- There are two possible solution for this problem
---
# Solution 1 Complexity
- Time complexity: O(n) because the array called **nums** is iterated

- Space complexity: O(n) because an additional array of size n is created.


# Solution 1 code
```java []
class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[nums.length]; 
        for (int i = 0 ; i < n ; i++){
            ans[2*i] = nums[i]; // x
            ans[2*i + 1] = nums[i + n]; // y
            
        }
        return ans;
        
    }
}
```

---

# Solution 2 Complexity
- Time complexity: O(n) because the array called **nums** is iterated

- Space complexity: O(n) because an additional array of size n is created.

# Solution 2 code

```java []
class Solution2{
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[nums.length]; 
        int index = 0;
        for (int i = 0 ; i < n ; i++){
            ans[index++] = nums[i]; // index++ increments after assignment
            ans[index++] = nums[i + n]; // index++ increments after assignment
        }
        return ans;      
    }
}
```
--- 
![Captura de pantalla 2026-01-02 210834.png](https://assets.leetcode.com/users/images/a6863a75-2d5a-4748-a022-9fea84052dcb_1767817089.760622.png)