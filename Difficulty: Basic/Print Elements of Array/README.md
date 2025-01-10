<h2><a href="https://www.geeksforgeeks.org/problems/print-elements-of-array4910/1?page=2&category=Arrays&difficulty=Basic&sortBy=submissions">Print Elements of Array</a></h2><h3>Difficulty Level : Difficulty: Basic</h3><hr><div class="problems_problem_content__Xm_eO"><p><span style="font-size: 18px;">Given an array <strong>a</strong><strong>rr</strong>, print all its elements <strong>space-separated</strong>.</span></p>
<p><span style="font-size: 18px;">Note: You <strong>don't need </strong>to move to the <strong>next line</strong> after printing all elements of the array (space-separated)</span></p>
<p><span style="font-size: 18px;"><strong>Examples:</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input: </strong>arr[] = [1, 2, 3, 4, 5]
<strong>Output:</strong> 1 2 3 4&nbsp;5
</span></pre>
<pre><span style="font-size: 18px;"><strong>Input: </strong>arr[] = [2, 3, 5, 5]
<strong>Output:</strong> 2 3 5 5
</span></pre>
<p><span style="font-size: 18px;"><strong>Expected Time Complexity:</strong> O(n)<br><strong>Expected Auxillary Space</strong></span><strong style="font-size: 18px; font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;">:</strong><span style="font-size: 18px; font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;">&nbsp;O(1)</span></p>
<p><span style="font-size: 18px;"><strong>Constraints:</strong><br>1 &lt;= arr.size &lt;= 10<sup>6</sup><br>1 &lt;= arr[i] &lt;= 10<sup>8</sup></span></p></div><br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Arrays</code>&nbsp;<code>Data Structures</code>&nbsp;

Here's an explanation of your code step by step:

### Code Breakdown:

#### 1. **Class and Function Definition**
```java
class Solution {
```
- A class named `Solution` is created, which contains the method `printArray` to print elements of an array in a space-separated format.

---

#### 2. **`printArray` Method**
```java
void printArray(int arr[]) {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < arr.length; i++) {
        sb.append(arr[i]); 
        if (i != arr.length - 1) {
            sb.append(" ");
        }
    }
    System.out.print(sb.toString());
}
```

- **Parameters**: 
  - Takes an integer array `arr[]` as input.

- **StringBuilder Initialization**:
  - A `StringBuilder` object `sb` is created to efficiently build the output string. 
  - This approach is faster than appending to strings directly using `+` or calling `System.out.print` multiple times.

- **Loop Through Array**:
  ```java
  for (int i = 0; i < arr.length; i++) {
      sb.append(arr[i]); 
      if (i != arr.length - 1) {
          sb.append(" ");
      }
  }
  ```
  - Iterates over all elements of the array.
  - `sb.append(arr[i])` adds the current array element to the `StringBuilder`.
  - If the current element is **not the last element** (`i != arr.length - 1`), a space `" "` is added after it to separate elements.

- **Print the Result**:
  ```java
  System.out.print(sb.toString());
  ```
  - Converts the `StringBuilder` to a `String` using `.toString()` and prints it in one operation.

---

#### 3. **`main` Method**
```java
public static void main(String[] args) {
    Solution obj = new Solution();
    int arr1[] = {1, 2, 3, 4, 5};
    obj.printArray(arr1);
}
```

- **Create an Object**:
  ```java
  Solution obj = new Solution();
  ```
  - An instance of the `Solution` class is created.

- **Define Input Array**:
  ```java
  int arr1[] = {1, 2, 3, 4, 5};
  ```
  - A sample input array `arr1` is declared and initialized with integers.

- **Call `printArray`**:
  ```java
  obj.printArray(arr1);
  ```
  - Calls the `printArray` method, passing `arr1` as the argument.
  - This prints the elements of `arr1` in a space-separated format.

---

### Key Points:

1. **Why Use `StringBuilder`?**
   - `StringBuilder` is faster and more memory-efficient compared to repeatedly concatenating strings or printing each element directly.
   - It minimizes the number of I/O operations by constructing the complete string in memory and printing it in a single call.

2. **Time Complexity**:
   - **Looping through the array**: \(O(n)\), where \(n\) is the size of the array.
   - **Appending to `StringBuilder`**: \(O(n)\), as appending each character or string is an \(O(1)\) operation.
   - **Overall**: \(O(n)\).

3. **Space Complexity**:
   - The space used by the `StringBuilder` is proportional to the size of the array \(O(n)\).

---

### Output:

For the input:
```java
int arr1[] = {1, 2, 3, 4, 5};
```

The output will be:
```
1 2 3 4 5
```
