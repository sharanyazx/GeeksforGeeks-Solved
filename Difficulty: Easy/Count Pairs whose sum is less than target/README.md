<h2><a href="https://www.geeksforgeeks.org/problems/count-pairs-whose-sum-is-less-than-target/1">Count Pairs whose sum is less than target</a></h2><h3>Difficulty Level : Difficulty: Easy</h3><hr><div class="problems_problem_content__Xm_eO"><p><span style="font-size: 18px;">Given an array&nbsp;<strong>arr[]</strong>&nbsp;and an integer&nbsp;<strong>target</strong>.&nbsp;</span><span style="background-color: #ffffff; color: #273239; font-family: Nunito, sans-serif; font-size: 18px; letter-spacing: 0.162px; text-align: justify;">You have to find the number of pairs in the array whose sum is strictly less than the&nbsp;<strong>target</strong>.</span></p>
<p><strong style="font-size: 18px;">Examples:</strong></p>
<pre><span style="font-size: 18px;"><strong>Input: </strong></span><span style="font-size: 18px;">arr[] = [7, 2, 5, 3], target = 8</span><span style="font-size: 18px;">
<strong>Output: </strong>2<strong>
Explanation: </strong></span><span style="font-size: 18px;">There are 2 pairs with sum less than 8: (2, 5) and (2, 3). </span></pre>
<pre><span style="font-size: 14pt;"><strong>Input: </strong>arr[] = [5, 2, 3, 2, 4, 1], target = 5
<strong>Output: </strong>4<strong>
Explanation: </strong></span><span style="font-size: 18.6667px;">There are 4 pairs whose sum is less than 5: (2, 2), (2, 1), (3, 1) and (2, 1).<br></span></pre>
<pre><span style="font-size: 14pt;"><strong>Input: </strong>arr[] = [2, 1, 8, 3, 4, 7, 6, 5], target = 7
<strong>Output: </strong>6<strong>
Explanation: </strong></span><span style="font-size: 18.6667px;">There are 6 pairs whose sum is less than 7: (2, 1), (2, 3), (2, 4), (1, 3), (1, 4) and (1, 5).</span></pre>
<p><span style="font-size: 18px;"><strong>Constraints:<br></strong>1 &lt;= arr.size() &lt;= 10<sup>5</sup><strong><br></strong></span><span style="font-size: 18px;">0 &lt;= arr[i]&nbsp;</span><span style="font-size: 18px;">&lt;= 10<sup>4</sup></span><span style="font-size: 18px;"><br></span><span style="font-size: 18px;">1 &lt;= target &lt;= 10<sup>4</sup></span></p></div><br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Sorting</code>&nbsp;<code>two-pointer-algorithm</code>&nbsp;<code>Arrays</code>&nbsp;

# Code Explanation & Working

### **Problem:**
You need to find the **number of pairs** in an array such that their sum is **strictly less than a given target**.

### **Example:**
**Input:**  
`arr[] = [7, 2, 5, 3], target = 8`

**Output:**  
`2`

**Explanation:**  
Pairs that satisfy the condition `sum < target`:
- (2, 5)
- (2, 3)

### **Approach:**

1. **Sort the Array**: Sorting the array allows us to use a **two-pointer technique** to efficiently find pairs.
   
2. **Two-pointer Technique**:
   - Start with one pointer at the beginning (`left`) and the other at the end (`right`) of the sorted array.
   - If `arr[left] + arr[right] < target`, all pairs between `arr[left]` and `arr[right-1]` are valid pairs because the array is sorted.
   - Count those pairs and move the `left` pointer to the right.
   - If `arr[left] + arr[right] >= target`, move the `right` pointer to the left to try a smaller sum.

### **Code:**

```java
import java.util.Arrays;

class Solution {
    static int countPairs(int arr[], int target) {
        Arrays.sort(arr);  // Step 1: Sort the array
        
        int left = 0;
        int right = arr.length - 1;
        int count = 0;

        // Step 2: Use two pointers to count valid pairs
        while (left < right) {
            if (arr[left] + arr[right] < target) {
                count += (right - left);  // Count valid pairs from left to right-1
                left++;  // Move left pointer to the right
            } else {
                right--;  // Move right pointer to the left
            }
        }

        return count;  // Return the total count of valid pairs
    }
}
```

### **Explanation of Code:**
1. **Sort the Array**: We start by sorting the array to make it easier to find pairs.
2. **Two Pointers**:
   - We initialize `left` at 0 and `right` at the end of the array.
   - If `arr[left] + arr[right]` is less than the target, all pairs from `arr[left]` to `arr[right-1]` are valid, so we add `right - left` to `count`.
   - If the sum is greater than or equal to the target, we move the `right` pointer to the left to check for smaller sums.
3. **Return the Result**: Finally, we return the total count of valid pairs.

### **Time Complexity:**
- **Sorting the array**: \( O(n log n) \)
- **Two-pointer traversal**: \( O(n) \)
- Overall time complexity: \( O(n log n) \)

### **Space Complexity:**
- \( O(1) \) (We only use a constant amount of extra space).

### **Example Walkthrough:**

#### Example 1:  
**Input:** `arr[] = [7, 2, 5, 3], target = 8`  
**Steps:**
- Sort the array: `[2, 3, 5, 7]`
- Two-pointer approach:
  - `left = 0, right = 3`: `2 + 7 = 9` (not valid, move right).
  - `left = 0, right = 2`: `2 + 5 = 7` (valid, count 2 pairs: `(2, 5)` and `(2, 3)`).
- Total pairs: `2`

#### Example 2:  
**Input:** `arr[] = [5, 2, 3, 2, 4, 1], target = 5`  
**Steps:**
- Sort the array: `[1, 2, 2, 3, 4, 5]`
- Two-pointer approach:
  - Count pairs where `arr[left] + arr[right] < target`.
- Total pairs: `4`

### Final understanding:

1. **Sort the Array:**
   - Sorting helps us easily find pairs with a sum less than the target using a two-pointer approach.

2. **Use Two Pointers:**
   - Set two pointers: one at the start (`left = 0`) and one at the end (`right = arr.length - 1`).
   - Loop through the array with these two pointers.

3. **Check Pair Sum:**
   - If the sum of `arr[left] + arr[right]` is **less than the target**, count all pairs from `left` to `right-1` because all of them will also be valid pairs (since the array is sorted). Then, move `left` one step to the right (`left++`).
   - If the sum is **greater than or equal to the target**, move the `right` pointer one step to the left (`right--`).

4. **Return the Result:**
   - After the loop ends, return the total count of valid pairs.





# This approach is efficient and works for large arrays.
