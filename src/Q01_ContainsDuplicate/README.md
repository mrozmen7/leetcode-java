# 🧮 Q01 - Contains Duplicate

**LeetCode Link:** [Contains Duplicate](https://leetcode.com/problems/contains-duplicate/)

---

## 📌 Problem

Given an integer array `nums`, return `true` **if any value appears at least twice** in the array, and `false` if every element is distinct.

> In other words:  
> ✅ If any number **repeats** → return `true`  
> ❌ If all numbers are **unique** → return `false`

---

## 🧠 Example

### ➤ Example 1:
```]java
Input:  nums = [1, 2, 3, 4]
Output: false

```
___  
## Approach

#### We solve this problem using a HashSet, which stores only unique values and allows constant-time lookups.
#### •	If we encounter a number that is already in the set → return true
#### •	Otherwise, we add the number to the set and continue

#### This eliminates the need for nested loops and gives us an efficient solution.



