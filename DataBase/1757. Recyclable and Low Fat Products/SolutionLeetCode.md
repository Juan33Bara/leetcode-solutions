# Solution 1 Approach
<!-- Describe your approach to solving the problem. -->
- The soluton selects the **products_id** from the **Products** table and filteres the rows using the **WHERE** clause.
- Only profucts that are marked as both **low_fat = 'Y'** AND **recyclable = 'Y'** are returned.

# Solution 1 Complexity
- Time complexity: O(n). where **n** is the number of rows in the **Products** table.
<!-- Add your time complexity here, e.g. $$O(n)$$ -->

# Solution 1 Code
```mysql []
# Write your MySQL query statement below
SELECT product_id
FROM Products
WHERE  low_fats = 'Y' AND recyclable = 'Y';
```

---
# Solution 2 Approach
<!-- Describe your approach to solving the problem. -->
- This solution is logically equivalent to Solution 1.
- It uses the **IN** operator insted of the equality operator **=**, but the behavior and the result remain the same.
- This version is included only as an alternative syntax.

# Solution 2 Complexity
- Time complexity: O(n)
<!-- Add your time complexity here, e.g. $$O(n)$$ -->

# Solution 2 Code
```mysql []
# Write your MySQL query statement below
SELECT product_id
FROM Products
WHERE  low_fats IN ('Y') AND recyclable IN ('Y');
```
---
![baby.png](https://assets.leetcode.com/users/images/f6fbb712-484f-49cf-a76d-46f1eeee3c56_1768924256.9321373.png)

