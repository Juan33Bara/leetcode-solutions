# Approach **Two-pointer solution**
- This solution uses a **two pointers** approach.
- While **idx1 < idx2**, swap the characters at both pointers.
- Use an auxiliar variable to does not lose the value of the idx1
- Use a temporary (auxiliar) variable to avoid losing one value during the swap.

# Complexity
- Time complexity:O(n/2) = O(n)


- Space complexity: O(1)


# Code
```java []
class Solution {
    public void reverseString(char[] s) {
        int idx1 = 0; 
        int idx2 = s.length-1; 
        char aux; 
        while (idx1 < idx2){
            aux = s[idx1];
            s[idx1] = s[idx2];
            s[idx2] = aux;
            idx1++;
            idx2--;
        }
    }
}
```

---
![baby.png](https://assets.leetcode.com/users/images/bc8e46bc-f77d-42e8-9511-0ef22e7f8cd8_1769816503.4276454.png)
