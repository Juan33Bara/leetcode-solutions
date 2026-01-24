# Solution 1 Approach (!= or <>)
- **<>** is also valid because it is the SQL standard.
- The **!=** operator is supported by most database enginges (dbms).

# Solution 1 Complexity
- Time complexity: O(n)

# Solution 1 Code
```mysql []
SELECT name
FROM Customer 
WHERE referee_id != 2 OR referee_id IS NULL  
```

---

# Solution 2 Approach (NOT IN)
- Same logic, but using **NOT IN** istead of **!=**.

# Solution 2 Complexity
- Time complexity: O(n)

# Solution 2 Code
```mysql []
# Write your MySQL query statement below
SELECT name
FROM Customer 
WHERE referee_id NOT IN (2) OR referee_id IS NULL 
```

---

![baby.png](https://assets.leetcode.com/users/images/c6cbe1b8-58f5-40d0-8380-eca08886dd2f_1769268133.2961125.png)

