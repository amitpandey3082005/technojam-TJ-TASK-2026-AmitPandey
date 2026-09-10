# 📁 Easy Level DSA Solutions

This folder contains the solutions for the **Easy level** problems assigned in the Technojm Club DSA interview task. Both problems have been optimized to run in linear time complexity.

---

## 📝 Problem 1: Balanced Brackets (Parentheses Matching)

### 💡 Approach & Logic
*   **Data Structure Used:** Stack
*   **Logic:** 
    *   We iterate through each individual character of the string.
    *   If an opening bracket (`(`, `{`, `[`) is encountered, it is pushed onto the stack.
    *   If a closing bracket (`)`, `}`, `]`) is encountered, we check if the stack is empty or if the top of the stack matches the corresponding opening bracket. If it matches, we pop it; otherwise, the string is unbalanced.
    *   After scanning the entire string, if the stack is completely empty, the brackets are balanced.
*   **Time Complexity:** **$O(n)$** (Single pass through the string of length $n$).
*   **Space Complexity:** **$O(n)$** (In the worst case for storing opening brackets in the stack).

---

## 📝 Problem 2: Find the Second Maximum Element in an Array

### 💡 Approach & Logic
*   **Logic:**
    *   Instead of sorting the array (which takes $O(n \log n)$), we solved this using a **single-pass iterative approach**.
    *   We maintain two variables: `max` and `second_max`, initialized to the minimum possible value.
    *   We iterate through the array using a loop. For each element:
        *   If the current element is greater than `max`, `second_max` becomes `max`, and `max` takes the value of the current element.
        *   If the current element is smaller than `max` but greater than `second_max`, we update `second_max`.
*   **Time Complexity:** **$O(n)$** (We iterate through the array exactly once).
*   **Space Complexity:** **$O(1)$** (Constant space utilized for the tracker variables).

---

<p align="center">Made with ❤️ by <b>Amit Pandey</b></p>
