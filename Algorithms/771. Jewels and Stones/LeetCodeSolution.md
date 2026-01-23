# Solution 1 Approach
<!-- Describe your approach to solving the problem. -->
- Create a HashMap to store jewel characters as keys.
- Iterate over the **jewels** and insert each character into the map.
- Iterate over **stones**; if the current character existe as a key in the map, increment **counter**.
- Return **counter**.
- 
# Solution 1 Complexity
- Time complexity: O(n + m)
<!-- Add your time complexity here, e.g. $$O(n)$$ -->

- Space complexity: O(n)
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Solution 1 Code
```java []

import java.util.HashMap;

class Solution{
    public int numJewelsInStones(String jewels, String stones) {
        // Define the hashMap data structure
        HashMap<Character, Integer> map = new HashMap<>();
        int counter = 0;
     
        // Iterate through jewels string to fill the hashMap
        for (int i = 0 ; i < jewels.length() ; i++){
            if (!map.containsKey(jewels.charAt(i))){
                map.put(jewels.charAt(i), 0);
            } 
        }

        // Iterate through stones string to count jewels
        for (int j = 0 ; j < stones.length() ; j++){
            char idx = stones.charAt(j); // get the character at index j of stones string
            if (map.containsKey(idx)) {
                map.put(idx , map.get(idx) + 1); // the method put() updates the value if the key already exists
                counter++;
            }
            // If the character is not a jewel, do nothing (there is no needed to add "continue" statement here)
        }


        return counter;
    }

}
```
---
# Solution 2 Approach

# Solution 2 Complexity
- Time complexity:

- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Solution 2 Code
```java []

```
---
![baby.png](https://assets.leetcode.com/users/images/b61459b9-2fbd-496d-a635-6636bf9de2bb_1769136775.3988037.png)
