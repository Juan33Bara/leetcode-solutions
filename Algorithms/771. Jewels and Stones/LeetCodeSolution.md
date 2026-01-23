# Solution 1 Approach (Using HashMap)
<!-- Describe your approach to solving the problem. -->
- Create a HashMap to store jewel characters as keys.
- Iterate over the **jewels** and insert each character into the map.
- Iterate over **stones**; if the current character existe as a key in the map, increment **counter**.
- Return **counter**.

# Solution 1 Complexity
- Time complexity: O(n + m)
  - 1 ms ; Beats 62.71%

- Space complexity: O(n)
  - 42.92 MB ; Beats 87.58%

# Solution 1 Code
```java []
// Using HashMap
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
# Solution 2 Approach (Using HashSet)
- Create a HashSet to store jewel characters as keys.
- Iterate over the **jewels** and insert each character into the set.
- Iterate over **stones**; if the current character exists in the set, increment **counter**.
- Return **counter**.


# Solution 2 Complexity
- Time complexity: O(n + m)
  - 1 ms ; Beats 62.71%
- Space complexity: O(n)
  - 43.29 MB ; Beats 43.09%

# Solution 2 Code
```java []
// Using HashSet

import java.util.HashSet;

public class Solution2 {
    public int numJewelsInStones(String jewels, String stones){
        HashSet<Character> set = new HashSet<>(); 
        int counter = 0;

        // Iterate over the jewels string to fill the HashSet
        for (int i = 0 ; i < jewels.length() ; i++){
            set.add(jewels.charAt(i));
        }

        // Iterate over the stones string to count jewels
        for (int i = 0 ; i < stones.length() ; i++){
            if (set.contains(stones.charAt(i))){
                counter++;

            }

        }
     
        

        return counter;
    }
    
}


```
---
![baby.png](https://assets.leetcode.com/users/images/b61459b9-2fbd-496d-a635-6636bf9de2bb_1769136775.3988037.png)
