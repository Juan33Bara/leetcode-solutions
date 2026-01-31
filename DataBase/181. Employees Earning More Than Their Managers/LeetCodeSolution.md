# Solution 1 Approach **SELF JOIN with INNER JOIN (modern, recommended)**
- This solution uses a SELF JOIN with the modern **explicit** **JOIN** syntax, which is generally preferred for its clarity and maintainability.
  
# Solution 1 Complexity
- Time complexity: O(n + n) = O(2n) = O(n) assuming an index on **Employee.id** (primary key), O(n²) in the worst case without indexes.



# Solution 1 Code
```mysql []
SELECT e.name AS Employee
FROM Employee e
JOIN Employee m ON e.managerId = m.id 
WHERE e.salary > m.salary;

```
---
# Solution 2 Approach  **SELF JOIN with implicit join syntax (older style)**
- This solution uses the **older** **style** of joins by listing multiple tables in the FROM clause and specifying the join condition in the WHERE clause.
- In real databases, performance is the same that of Solution 1. 
  
# Solution 2 Complexity
- Time complexity: O(n + n) = O(2n) = O(n) assuming an index on **Employee.id** (primary key), O(n²) in the worst case without indexes.



# Solution 2 Code
```mysql []
SELECT e1.name AS Employee
FROM Employee e1, Employee e2
WHERE e1.managerId = e2.id
AND e1.salary > e2.salary;
```

---
![baby.png](https://assets.leetcode.com/users/images/859e7851-51ec-4dd0-9911-152b85971fd1_1769881334.1459594.png)
