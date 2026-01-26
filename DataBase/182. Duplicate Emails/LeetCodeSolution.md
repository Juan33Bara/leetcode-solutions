# Approach
<!-- Describe your approach to solving the problem. -->
- From table called **Person** group by **email** column. 
- Keep only the groups where the count is greater than 1.

# Complexity
- Time complexity: O(n)
<!-- Add your time complexity here, e.g. $$O(n)$$ -->

# Code
```mysql []
SELECT email
FROM Person
GROUP BY email
HAVING COUNT(email) > 1
```