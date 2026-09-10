# 📁 Medium Level DSA Solutions

This folder contains the solution for the **Medium level** problem assigned in the Technojm Club DSA interview task. 

---

## 📝 Problem 1: Count Subarrays with Target Sum

### 💡 Approach & Logic
*   **Approach Used:** Brute Force (Nested Loops)
*   **Logic:** 
    *   The goal is to find the total number of continuous subarrays whose elements sum up to a specific target value.
    *   We track all possible subarrays by using two nested loops.
    *   The outer loop (`i`) starts from index `0` and fixes the starting point of the subarray.
    *   The inner loop (`j`) starts from `i` and iterates through the remaining elements to calculate the running sum of the current subarray.
    *   Whenever the running sum equals the given target value, we increment our counter.
*   **Time Complexity:** **$O(n^2)$** (Due to the two nested loops iterating through all possible subarray configurations).
*   **Space Complexity:** **$O(1)$** (Constant space utilized as we only use variables to store the tracking pointers and sum counters).

---

<p align="center">Made with ❤️ by <b>Amit Pandey</b></p>

