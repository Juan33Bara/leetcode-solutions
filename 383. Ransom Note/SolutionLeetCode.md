# Solution 1 approach (array + accumulator)
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
# Solution 2 Approach (array + early exit)
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
# Solution 3 Approach (HashMap)
- This solution uses HashMap to count character frequencies.
- Very similar to Solution2 but uses HashMap instead of array, but the logic is practically
# Solution 3 Complexity
- Time complexity: O(n + m)
  - 10 ms ; Beats 49.44%.
<!-- Add your time complexity here, e.g. $$O(n)$$ -->

- Space complexity: O(26) (worst case) = O(1) constant space
  - 47.30 MB ; Beats 16.34%. 
<!-- Add your space complexity here, e.g. $$O(n)$$ -->


# Solution 3 Code
```java []
// Solution using HashMap to count character frequencies
import java.util.HashMap; // Import HashMap from java.util package.
import java.util.Map; // Import Map interface from java.util package.

class Solution3 {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> freq = new HashMap<>(); // Example 'a' --> 3, 'b' --> 5, etc. 

        // 1) Count each character in magazine
        for (int i = 0; i < magazine.length(); i++) {
            char c = magazine.charAt(i); // Get character at index i
            // The method put() inserts key-value pair into the map. If key already exists, it updates the value.
            // The method getOrDefault() returns the value for the specified key, or a default value if the key is not found.
            freq.put(c, freq.getOrDefault(c, 0) + 1); // Plus one occurrence of character c
        }

        // 2) Consume characters needed by ransomNote
        for (int i = 0; i < ransomNote.length(); i++) {
            char c = ransomNote.charAt(i);
            int available = freq.getOrDefault(c, 0); // Get the value for key c, or 0 if not found

            if (available == 0) return false; // not enough of that character

            freq.put(c, available - 1); // spend one only if available > 0
        }

        return true;
    }
}
```



---
![baby.png](https://assets.leetcode.com/users/images/d33fa5c7-3a4f-4741-8d95-b473034b1ace_1767995712.945771.png)
