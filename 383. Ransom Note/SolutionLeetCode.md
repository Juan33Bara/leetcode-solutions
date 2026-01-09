# Approach
<!-- Describe your approach to solving the problem. -->
-Create an integer array called **counter** that has 26 elements.
-Create a local variable called **accumulator**.
-Iterate over the **ransomNote** and , for each character, increment the corresponding index in the counter array. In **ASCII**, the character 'a' is represented by the number 97 and 'z' is represented by 122. Therefore, if you substract, for example, 'a' - 'a', you get 97 minus 97, which equals 0, and this result corresponds to the index in the **counter** array that represents the character 'a'.
-Iterate over the **magazine** and, for each character, first check if the value at that index in the **counter** array is zero. If it's not zero, then decrement that index.
-Iterate thruough the **counter** array and add each value to the **accumulator**.
-Check if the **accumulator** is zerom and return a boolean value based on that check.

# Complexity
- Time complexity: O(n + m + 26) = O(n + m)
<!-- Add your time complexity here, e.g. $$O(n)$$ -->

- Space complexity: O(26) = O(1) constant space
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```java []
class Solution {
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

![baby.png](https://assets.leetcode.com/users/images/d33fa5c7-3a4f-4741-8d95-b473034b1ace_1767995712.945771.png)
