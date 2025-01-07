<h2><a href="https://www.geeksforgeeks.org/problems/pair-with-given-sum-in-a-sorted-array4940/1">Pair with given sum in a sorted array</a></h2><h3>Difficulty Level : Difficulty: Easy</h3><hr><div class="problems_problem_content__Xm_eO"><p><span style="font-size: 20px;">You are given an integer <strong>target</strong> and an array <strong>arr[]</strong>. You have to find number of pairs in <strong>arr[]</strong> which sums up to <strong>target</strong>. It is given that the elements of the <strong>arr[]</strong> are in <strong>sorted </strong>order.<br><strong>Note:</strong> pairs should have elements of distinct indexes.&nbsp;</span></p>
<p><span style="font-size: 20px;"><strong>Examples :</strong></span></p>
<pre><span style="font-size: 20px;"><strong>Input: </strong>arr[] = [-1, 1, 5, 5, 7], target = 6
<strong>Output: </strong>3
<strong>Explanation: </strong>There are 3 pairs which sum up to 6 : {1, 5}, {1, 5} and {-1, 7}.
</span></pre>
<pre><span style="font-size: 20px;"><strong>Input: </strong>arr[] = [1, 1, 1, 1], target = 2<br></span><strong style="font-size: 20px;">Output: </strong><span style="font-size: 20px;">6<br></span><strong style="font-size: 20px;">Explanation: </strong><span style="font-size: 20px;">There are 6 pairs which sum up to 2 : {<span style="color: #273239; font-family: Nunito, sans-serif; font-size: 14pt; letter-spacing: 0.162px; text-wrap-mode: wrap; background-color: #f9f9f9;">1, 1}, {1, 1}, {1, 1}, {1, 1}, {1, 1} and {1, 1}.</span></span></pre>
<pre><span style="font-size: 20px;"><strong>Input: </strong>arr[] = [-1, 10, 10, 12, 15], target = 125
<strong>Output: </strong>0
<strong>Explanation: </strong>There is no such pair which sums up to 4.</span></pre>
<p><span style="font-size: 20px;"><strong>Constraints:</strong><br>-10<sup>5</sup> &lt;= target &lt;=10<sup>5</sup><br>&nbsp;2 &lt;= arr.size() &lt;= 10<sup>5</sup><br>-10<sup>5</sup> &lt;= arr[i] &lt;= 10<sup>5</sup></span></p></div><p><span style=font-size:18px><strong>Company Tags : </strong><br><code>Adobe</code>&nbsp;<br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>two-pointer-algorithm</code>&nbsp;<code>Arrays</code>&nbsp;<code>Data Structures</code>&nbsp;<code>Algorithms</code>&nbsp;











---

## Problem Explanation:
You are given a sorted integer array `arr[]` and a `target` sum. You need to count the number of unique pairs in the array whose elements add up to the target sum. 

### Constraints:
1. Elements must be from distinct indexes.
2. The array is sorted in ascending order.

---

## Code Explanation:

### **Step 1: Function Definition**
```java
int countPairs(int arr[], int target)
```
This function takes two inputs:
- `arr[]`: A sorted array of integers.
- `target`: An integer representing the desired sum.

The function returns the total count of unique pairs that sum to `target`.

---

### **Step 2: Initialize Variables**
```java
int result = 0, start = 0, end = arr.length - 1;
```
- **`result`**: Stores the total count of valid pairs.
- **`start`**: A pointer starting at the beginning of the array.
- **`end`**: A pointer starting at the end of the array.

**Example:**  
For `arr = [1, 1, 1, 1]`, `target = 2`:  
- `start = 0`, `end = 3`, `result = 0`.

---

### **Step 3: Loop Until `start` Meets `end`**
```java
while (start < end) {
```
The loop continues as long as `start` is less than `end`. This ensures that pairs are formed from distinct indexes.

---

### **Step 4: Calculate the Sum**
```java
int Sum = arr[start] + arr[end];
```
- Calculate the sum of the elements pointed to by `start` and `end`.

**Example:**  
For `arr = [1, 1, 1, 1]`, when:
- `start = 0`, `end = 3`: `Sum = 1 + 1 = 2`.

---

### **Step 5: Adjust Pointers Based on `Sum`**
```java
if (Sum > target) {
    end--;
} else if (Sum < target) {
    start++;
}
```
- If `Sum > target`: Decrease the `end` pointer to reduce the sum.
- If `Sum < target`: Increase the `start` pointer to increase the sum.

**Example:**  
For `arr = [-1, 1, 5, 5, 7]`, `target = 6`:
1. Initially: `start = 0`, `end = 4`, `Sum = -1 + 7 = 6`.
   - `Sum == target`, continue to the next block.
2. If `Sum > target`: Move `end` left (e.g., `end = 3`).
3. If `Sum < target`: Move `start` right (e.g., `start = 1`).

---

### **Step 6: Handle the Case Where `Sum == target`**
```java
else {
    int e1 = arr[start], e2 = arr[end], occur1 = 0, occur2 = 0;
```
- If `Sum == target`, both elements at `start` and `end` pointers contribute to valid pairs.
- `e1`: Value at `start`.
- `e2`: Value at `end`.
- `occur1` and `occur2`: Count the number of occurrences of `e1` and `e2`.

**Example:**  
For `arr = [-1, 1, 5, 5, 7]`, `start = 1`, `end = 3`:  
- `e1 = arr[1] = 1`.
- `e2 = arr[3] = 5`.

---

### **Step 7: Count Consecutive Occurrences**
```java
while (start <= end && arr[start] == e1) {
    start++;
    occur1++;
}
while (start <= end && arr[end] == e2) {
    end--;
    occur2++;
}
```
- Count how many times `e1` occurs starting from `start`.
- Count how many times `e2` occurs ending at `end`.

**Example:**  
For `arr = [-1, 1, 5, 5, 7]`:
1. `start = 1`: `e1 = 1`, `occur1 = 1`.
2. `end = 3`: `e2 = 5`, `occur2 = 2`.

---

### **Step 8: Add Pair Counts**
```java
if (e1 == e2) {
    result += (occur1 * (occur1 - 1)) / 2;
} else {
    result += occur1 * occur2;
}
```
- If `e1 == e2`: Both pointers point to the same value. Use the combination formula to count pairs:
  \[
  **Pairs = (occur1 * occur1-1) /2**
  \]
- If `e1 != e2`: Multiply `occur1` and `occur2` to get all pairs between these values.

**Example 1 (e1 != e2):**  
For `arr = [-1, 1, 5, 5, 7]`, `e1 = 1`, `occur1 = 1`, `e2 = 5`, `occur2 = 2`:  
\[
result += 1 \times 2 = 2
\]

**Example 2 (e1 == e2):**  
For `arr = [1, 1, 1, 1]`, `e1 = e2 = 1`, `occur1 = 4`:  
\[
result += 4*(4-1)/2= 6
\]

---

### **Step 9: Return Result**
```java
return result;
```
- The total count of valid pairs is stored in `result`.

---

## Complexity Analysis:
1. **Time Complexity:** \(O(n)\)
   - The array is traversed once using two pointers.
   - Counting consecutive occurrences is efficient for sorted arrays.
2. **Space Complexity:** \(O(1)\)
   - Only a few variables are used.

---

## Example Walkthrough:

**Input:**  
`arr = [-1, 1, 5, 5, 7]`, `target = 6`.

**Steps:**  
1. Initialize: `result = 0`, `start = 0`, `end = 4`.
2. Loop:
   - `Sum = arr[0] + arr[4] = -1 + 7 = 6`.
   - `Sum == target`, count pairs: `e1 = -1`, `occur1 = 1`; `e2 = 7`, `occur2 = 1`.
   - Add pairs: `result += 1 * 1 = 1`.
   - Update pointers: `start = 1`, `end = 3`.
   - Repeat for other pairs.

**Output:**  
`result = 3`.
