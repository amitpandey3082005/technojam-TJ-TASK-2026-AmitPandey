# 📁 Hard Level DSA Solutions

This folder contains the solution for the **Hard level** problem assigned in the Technojm Club DSA interview task. The solution has been highly optimized using bitwise operations to run in linear time and constant space.

---

## 📝 Problem 1: Concatenation of Consecutive Binary Numbers

### 💡 Approach & Logic
The problem requires us to concatenate the binary representations of all numbers from `1` to `n` in order and return the decimal value of the resulting string modulo $998244353$.

*   **Optimized Strategy:** Instead of converting numbers to string representations (which is slow and memory-intensive), we processed this mathematically using **Bitwise Operations** in a single loop.
*   **Dynamic Bit Length Tracking:** 
    *   We maintain the length of the binary representation (`binaryLength`) dynamically.
    *   Whenever the loop counter `i` hits the `nextPowerOf2` (e.g., 2, 4, 8, 16...), it means the number of bits required to represent the number increases by 1. 
    *   We shift the `nextPowerOf2` left by 1 (`nextPowerOf2 <<= 1`) to prepare for the next boundary.
*   **Concatenation Logic:**
    *   To append the binary of `i` to our current `result`, we left-shift the existing `result` by the calculated `binaryLength` positions. This opens up exact spaces at the end for the new number.
    *   We then add the value of `i` directly.
*   **Overflow Prevention:** We use `long` data types to handle big multiplications and apply the `% MOD` operation on every iteration to keep memory usage under bounds.

### 📊 Complexity Analysis
*   **Time Complexity:** **$O(n)$** (Single pass loop running from `1` to `n`. Every bitwise shifting and addition operation takes $O(1)$ constant time).
*   **Space Complexity:** **$O(1)$** (No extra data structures or strings are allocated; only temporary tracker variables are used).

---

<p align="center">Made with ❤️ by <b>Amit Pandey</b></p>

