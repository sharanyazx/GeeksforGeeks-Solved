<h2><a href="https://www.geeksforgeeks.org/problems/palindromic-array-1587115620/1?page=1&category=Arrays&difficulty=Basic&sortBy=submissions">Palindromic Array</a></h2><h3>Difficulty Level : Difficulty: Basic</h3><hr><div class="problems_problem_content__Xm_eO"><p><span style="font-size: 18px;">Given </span><span style="font-size: 18px;">an</span><span style="font-size: 18px;"> array <strong>arr[]</strong> of positive integers. R</span><span style="font-size: 18px;">eturn true if all the array elements are palindrome otherwise, return false.</span></p>
<p><strong><span style="font-size: 18px;">Examples:</span></strong></p>
<pre><span style="font-size: 18px;"><strong>Input: </strong>arr[]<strong> </strong>= [</span><span style="font-size: 18px;">111, 222, 333, 444, 555]</span>
<span style="font-size: 18px;"><strong>Output: </strong>true</span>
<span style="font-size: 18px;"><strong>Explanation:</strong></span>
<span style="font-size: 18px;">arr[0] = 111, which is a palindrome number.
arr[1] = 222, which is a palindrome number.
arr[2] = 333, which is a palindrome number.
arr[3] = 444, which is a palindrome number.
arr[4] = 555, which is a palindrome number.
As all numbers are palindrome so This will return true.</span></pre>
<pre><span style="font-size: 18px;"><strong>Input: </strong>arr[] = [121, 131, 20]</span>
<span style="font-size: 18px;"><strong><span style="font-size: 18px;">Output:</span> </strong></span><span style="font-size: 18px;">false</span>
<span style="font-size: 18px;"><strong>Explanation: </strong>20 is not a palindrome hence the output is false.</span>
</pre>
<p><span style="font-size: 18px;"><strong>Expected Time Complexity: </strong>O(nlogn)<br></span><span style="font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif; font-size: 18px;"><strong>Expected Space&nbsp;</strong></span><strong style="font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif; font-size: 18px;">Complexity</strong><strong style="font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif; font-size: 18px;">: </strong><span style="font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif; font-size: 18px;">O(1)</span></p>
<p><span style="font-size: 18px;"><strong>Constraints:</strong></span><br><span style="font-size: 18px;">1 &lt;=arr.size&lt;= 20</span><br><span style="font-size: 18px;">1 &lt;=arr[i]&lt;= 10<sup>5</sup></span></p></div><br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Arrays</code>&nbsp;<code>Data Structures</code>&nbsp;



### **Purpose of the Code**
The code is designed to check if **all the integers in a given array** are palindromic numbers. A **palindromic number** is a number that remains the same when its digits are reversed, such as `121` or `1331`.

---

### **How It Works**

1. **Main Function (`isPalinArray`)**:
   - **Input**: An array of integers, `arr`.
   - **Output**: `true` if all numbers in the array are palindromic; otherwise, `false`.

   - **Steps**:
     - Iterates over each number in the array (`for (int num : arr)`).
     - For each number, calls the helper function `isPalindrome(num)` to check if the number is palindromic.
     - If any number is not palindromic, the function immediately returns `false`.
     - If the loop completes without finding a non-palindromic number, it returns `true`.

2. **Helper Function (`isPalindrome`)**:
   - **Input**: A single integer, `num`.
   - **Output**: `true` if the number is a palindrome; otherwise, `false`.

   - **Steps**:
     - Saves the original number in a variable, `original`, for later comparison.
     - Initializes `reversed` to `0` to build the reverse of the number.
     - Uses a loop to reverse the digits of `num`:
       - Extracts the last digit of `num` using `num % 10`.
       - Appends this digit to `reversed` using `reversed = reversed * 10 + digit`.
       - Removes the last digit of `num` using integer division (`num = num / 10`).
     - After the loop, compares the `reversed` number with the `original` number. If they are equal, the number is a palindrome.

---

### **Key Points**

1. **Iterating Over the Array**:
   - `for (int num : arr)` iterates over each element of the array, `arr`.

2. **Palindrome Check**:
   - The `isPalindrome` function determines if a single number is palindromic by reversing it and comparing it to the original.

3. **Short-Circuiting**:
   - In `isPalinArray`, if any number is found to be non-palindromic, the function immediately returns `false`, optimizing the process.

4. **Returning True**:
   - If the loop completes without finding a non-palindromic number, all numbers are palindromic, and the function returns `true`.

---

### **Example Execution**

#### Input:
`arr = {121, 232, 343, 454, 565}`

#### Execution:
1. `isPalinArray` starts looping through the array.
2. For each number:
   - `isPalindrome(121)` → `reversed = 121`, matches `original = 121` → `true`.
   - `isPalindrome(232)` → `reversed = 232`, matches `original = 232` → `true`.
   - `isPalindrome(343)` → `reversed = 343`, matches `original = 343` → `true`.
   - `isPalindrome(454)` → `reversed = 454`, matches `original = 454` → `true`.
   - `isPalindrome(565)` → `reversed = 565`, matches `original = 565` → `true`.
3. Since all numbers are palindromic, `isPalinArray` returns `true`.

---

#### Input:
`arr = {121, 234, 343}`

#### Execution:
1. `isPalinArray` starts looping through the array.
2. For each number:
   - `isPalindrome(121)` → `reversed = 121`, matches `original = 121` → `true`.
   - `isPalindrome(234)` → `reversed = 432`, does not match `original = 234` → `false`.
3. The loop exits early, and `isPalinArray` returns `false`.

---

### **Complexity**

1. **Time Complexity**:
   - Checking if a single number is palindromic takes \(O(d)\), where \(d\) is the number of digits.
   - Iterating over the array of size \(n\) gives a total time complexity of \(O(n \cdot d)\).

2. **Space Complexity**:
   - The algorithm uses a constant amount of extra space, \(O(1)\).

---

### **Advantages**

- Efficient: Stops processing as soon as it finds a non-palindromic number.
- Modular: Separates the palindrome check logic into a helper function, making it reusable and easy to debug.

### **Use Case**
This function is particularly useful for verifying arrays of integers for palindromic properties in coding challenges or validation systems.
