# Solution 1 Approach 
<!-- Describe your approach to solving the problem. -->
- Obviously, it’s not the best solution because I’m a beginner, but it works.
- Basically, I perform several data type conversions between int and String.
- At first, I used an **int** for the number variable, but this did not work for all test cases. Therefore, I had to change int to **BigInteger**.

# Solution 1 Complexity 
- Time complexity: O(n + n) = O(2n) = O(n) because there are 2 loops.
<!-- Add your time complexity here, e.g. $$O(n)$$ -->

- Space complexity: O(n) because I create a new array.
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Solution 1 Code 
```java []
import java.math.BigInteger;

class Solution {
    public int[] plusOne(int[] digits) {

        String numberAsString = "";
        for (int i = 0; i < digits.length; i++) {
            numberAsString += String.valueOf(digits[i]);
        }

        // ONLY CHANGE: int -> BigInteger
        BigInteger number = new BigInteger(numberAsString);
        number = number.add(BigInteger.ONE);

        String newNumberAsString = number.toString();

        int[] digitFinal = new int[newNumberAsString.length()];
        for (int i = 0; i < newNumberAsString.length(); i++) {
            digitFinal[i] = Character.getNumericValue(newNumberAsString.charAt(i));
        }

        return digitFinal;
    }
}

```
---
# Solution 2 Approach 
- This is a better solution


# Solution2 Complexity
- Time complexity: O(n) because there is 1 loop
<!-- Add your time complexity here, e.g. $$O(n)$$ -->

- Space complexity: O(n) in the worst case, because when all digits are 9, a new array of size n+1 is created. Otherwise, the algorithm works in-place using O(1) extra space.
<!-- Add your space complexity here, e.g. $$O(n)$$ -->


# Solution 2 Code
```java []
public class Solution2 {
    public int[] plusOne(int[] digits){
        for (int i = digits.length -1; i >= 0 ; i--){
            if (digits[i] < 9 ){
                digits[i]++; 
                return digits;
            } 
            digits[i] = 0;
        }
        int[] res = new int[digits.length + 1];
        res[0] = 1;
        return res;

    }
    
}

```

**Pd: I'm beginner**
![Captura de pantalla 2026-01-02 210834.png](https://assets.leetcode.com/users/images/4750d4ef-f135-4d76-929f-bcf551744760_1767398935.6532645.png)
