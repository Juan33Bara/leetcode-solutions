# Solution 1 approach
<!-- Describe your approach to solving the problem. -->
- Create an integer array called **counter** with 26 elements.
- Create a local variable called **accumulator**.
- Iterate over the **ransomNote**, and for each character, increment the corresponding index in the **counter** array. In **ASCII**, the character 'a' is represented by 97 and 'z' by 122. Therefore, subtracting 'a' from a character maps it to an index between 0 and 25.
- Iterate over the **magazine**, and for each character, first check if the value at the corresponding index in the **counter** array is zero. If it is not zero, decrement that index.
- Iterate through the **counter** array and add each value to the **accumulator**.
- Check if the **accumulator** is zero and return a boolean value based on that check.


# Solution 1 Complexity
- Time complexity: O(n + m + 26) = O(n + m)
  - 3 ms ; Beats 56.97%.
<!-- Add your time complexity here, e.g. $$O(n)$$ -->

- Space complexity: O(26) = O(1) constant space
  - 46.30 MB ; Beats 64.64%.
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Solution 1 Code
```java []
class Solution1 {
        public static boolean canConstruct(String ransomNote, String magazine) {
        int[] counter = new int[26]; 
        int accumulator = 0;
        for (int i = 0 ; i < ransomNote.length() ; i++){
            counter[ransomNote.charAt(i) - 'a'] += 1;
        }
        for (int i = 0 ; i < magazine.length() ; i++){
            if (counter[magazine.charAt(i) - 'a'] == 0){
                continue;
            } else {
                counter[magazine.charAt(i) - 'a'] -= 1;
            } 
        }
        for (int num : counter){
            accumulator += num;
        }
        return accumulator == 0;
        
    }
}
```

---
# Solution 2 Approach 
- This is a better solution because it has one less loop than Solution 1.
- 
# Solution 2 Complexity
- Time complexity: O(n + m). More fast than Solution 1
  - 1-2 ms ; Beats 99.81%.
<!-- Add your time complexity here, e.g. $$O(n)$$ -->

- Space complexity: O(26) = O(1) constant space. Same as Solution 1
  - 46.60 MB ; Beats 50.39%. 
<!-- Add your space complexity here, e.g. $$O(n)$$ -->


# Solution 2 Code
```java []
// Solution without using "Hash map"
class Solution2 {
    public static boolean canConstruct(String ransomNote, String magazine) {
        int[] count = new int[26]; // This is the array with the alphabet letters
       
        // Count available letters in magazine
        for (int i = 0; i < magazine.length(); i++) {
            count[magazine.charAt(i) - 'a']++;
        }

        // Spend letters for ransomNote
        for (int i = 0 ; i < ransomNote.length() ; i++){
            int idx = ransomNote.charAt(i) - 'a'; 
            count[idx]--; // Decrement 1 
            if (count[idx] < 0) return false;
        }
        return true;

    }
}
```
---

![baby.png](https://assets.leetcode.com/users/images/d33fa5c7-3a4f-4741-8d95-b473034b1ace_1767995712.945771.png)
