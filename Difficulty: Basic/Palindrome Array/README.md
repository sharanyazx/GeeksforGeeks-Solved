<h2><a href="https://www.geeksforgeeks.org/problems/perfect-arrays4645/1?page=2&category=Arrays&difficulty=Basic&sortBy=submissions">Palindrome Array</a></h2><h3>Difficulty Level : Difficulty: Basic</h3><hr><div class="problems_problem_content__Xm_eO"><p><span style="font-size: 18px;">Given an array <strong>arr</strong>, the task is to find whether the <strong>arr</strong> is&nbsp;</span><span style="font-size: 18px;">palindrome</span><span style="font-size: 18px;"> or not.&nbsp;</span><span style="font-size: 18px;">If the&nbsp;</span><strong style="font-size: 18px;">arr&nbsp;</strong><span style="font-size: 18px;">is palindrome then return</span><strong style="font-size: 18px;">&nbsp;true&nbsp;</strong><span style="font-size: 18px;">else return</span><strong style="font-size: 18px;"> false.</strong></p>
<blockquote>
<p><span style="font-size: 18px;">An array is said to be&nbsp;</span><span style="font-size: 18px;">palindrome</span><span style="font-size: 18px;"> if its reverse array matches the original array.&nbsp;</span></p>
</blockquote>
<p><span style="font-size: 18px;"><strong>Examples:</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input: </strong>arr = [1, 2, 3, 2, 1]
<strong>Output:</strong> true
<strong>Explanation: </strong>Here we can see we have [1, 2, 3, 2, 1] if we reverse it we can find [1, 2, 3, 2, 1] which is the same as before. So, the answer is <strong>true</strong>.
</span></pre>
<pre><span style="font-size: 18px;"><strong>Input: </strong>arr = [1, 2, 3, 4, 5]
<strong>Output:</strong> false<br><strong style="font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;">Explanation: </strong>Here we can see we have [1, 2, 3, 4, 5] if we reverse it we find [5, 4, 3, 2, 1] which is the not same as before. So, the answer <strong style="font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;">false</strong><span style="font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;">.</span></span><span style="font-size: 18px;"><br></span></pre>
<p><span style="font-size: 18px;"><strong>Expected Time Complexity:</strong> O(n)<br><strong>Expected Auxiliary Space:</strong> O(1)</span></p>
<p><span style="font-size: 18px;"><strong>Constraints:</strong><br>1 ≤ arr.size ≤ 10<sup>6</sup><br>1 ≤ arr[i] ≤ 10<sup>9</sup></span></p></div><br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Arrays</code>&nbsp;<code>Data Structures</code>&nbsp;


### Explanation of the Code

This Java code checks whether an **array is palindromic in structure**, meaning the array reads the same from left to right as it does from right to left. Here's a detailed explanation of the code:

---
### Code
```java
class Solution {
    public static boolean isPerfect(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n / 2; i++) {
            if (arr[i] != arr[n - i - 1]) {
                return false; 
            }
        }
        return true; 
    }
}

```

### Code Breakdown:

#### Function Definition:
```java
public static boolean isPerfect(int[] arr)
```
- The method `isPerfect` takes an integer array `arr` as input and returns a boolean value:
  - `true` if the array is palindromic.
  - `false` otherwise.

---

#### Key Logic:
```java
int n = arr.length;
for (int i = 0; i < n / 2; i++) {
    if (arr[i] != arr[n - i - 1]) {
        return false; 
    }
}
return true; 
```

1. **Length Calculation:**
   ```java
   int n = arr.length;
   ```
   - `n` is the length of the array, used to iterate and compare elements.

2. **Iterate Over Half of the Array:**
   ```java
   for (int i = 0; i < n / 2; i++) {
   ```
   - We only need to iterate over the first half of the array (`i < n / 2`) because we compare each element with its corresponding element from the other end.

3. **Compare Opposite Elements:**
   ```java
   if (arr[i] != arr[n - i - 1]) {
       return false;
   }
   ```
   - For each index `i`, check if the element `arr[i]` matches the corresponding element from the other end, `arr[n - i - 1]`.
   - If any pair does not match, the array is **not palindromic**, and the function returns `false`.

4. **Return `true`:**
   ```java
   return true;
   ```
   - If all corresponding elements match, the array is **palindromic**, and the function returns `true`.

---

### Example Walkthrough

#### Input: 
```java
int[] arr = {1, 2, 3, 2, 1};
```

#### Execution:
- `n = arr.length = 5`
- Loop through the array:
  - For `i = 0`: Compare `arr[0]` (1) and `arr[4]` (1) → Match.
  - For `i = 1`: Compare `arr[1]` (2) and `arr[3]` (2) → Match.
- All comparisons are valid, so return `true`.

#### Output:
```java
true
```

---

#### Input: 
```java
int[] arr = {1, 2, 3, 4, 5};
```

#### Execution:
- `n = arr.length = 5`
- Loop through the array:
  - For `i = 0`: Compare `arr[0]` (1) and `arr[4]` (5) → Mismatch.
- Return `false`.

#### Output:
```java
false
```

---

### Time Complexity:
- The loop iterates through half the array: \( O(n/2) \), which simplifies to \( O(n) \).
- Overall time complexity is \( O(n) \).

### Space Complexity:
- The function uses a constant amount of extra space: \( O(1) \).

---

