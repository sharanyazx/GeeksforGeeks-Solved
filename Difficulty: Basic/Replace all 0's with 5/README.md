<h2><a href="https://www.geeksforgeeks.org/problems/replace-all-0s-with-5/1?page=2&category=Arrays&difficulty=Basic&sortBy=submissions">Replace all 0's with 5</a></h2><h3>Difficulty Level : Difficulty: Basic</h3><hr><div class="problems_problem_content__Xm_eO"><p><span style="font-size: 18px;">You are given an integer <strong>n</strong>. You need to convert all zeroes of <strong>n</strong> to 5. </span></p>
<p><span style="font-size: 18px;"><strong>Examples:</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input: </strong>n = 1004
<strong>Output: </strong>1554<strong>
Explanation: </strong>There are two zeroes in 1004 on replacing all zeroes with 5, the new number will be 1554.</span>
</pre>
<pre><span style="font-size: 18px;"><strong>Input: </strong>n = 121
<strong>Output: </strong>121<strong>
Explanation: </strong>Since there are no zeroes in 121, the number remains as 121.</span></pre>
<p><span style="font-size: 18px;"><strong>Expected Time Complexity:</strong> O(k</span>)<span style="font-size: 18px;"><br><strong>Expected Auxillary Space</strong></span><strong style="font-size: 18px;">:</strong><span style="font-size: 18px;"> O(1)<br>Note:&nbsp;</span><span style="font-size: 18px;">&nbsp;</span><span style="font-size: 18px;">where k is the number of digits in n</span></p>
<p><span style="font-size: 18px;"><strong>Constraints:</strong><br>0 &lt;= n &lt;= 10<sup>4</sup></span></p></div><p><span style=font-size:18px><strong>Company Tags : </strong><br><code>Amazon</code>&nbsp;<br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Arrays</code>&nbsp;<code>Mathematical</code>&nbsp;<code>Data Structures</code>&nbsp;<code>Algorithms</code>&nbsp;



### **Concept**

1. **String Conversion:**
   - To easily traverse and manipulate individual digits of the number, the input integer is converted to a `String`.

2. **String Traversal:**
   - Each character of the string is checked to see if it is a `'0'`. If yes, it is replaced with `'5'`. Otherwise, the character is added as is.

3. **StringBuilder Usage:**
   - A `StringBuilder` is used to construct the modified string efficiently, as it allows for mutable sequences of characters.

4. **Re-conversion to Integer:**
   - After modifying the string, the result is converted back to an integer using `Integer.parseInt()`.

---

### **Code Breakdown**

```java
class Solution {
    int convertfive(int num) {
        // Your code here
        String aa=Integer.toString(num);
        StringBuilder result = new StringBuilder();
        for(int i=0;i<aa.length();i++){
            if(aa.charAt(i)=='0'){
                result.append('5');   
            } else {
                result.append(aa.charAt(i)); 
            }
        }
        int hi=Integer.parseInt(result.toString());
        return hi;
    }
}
```

---

### **Key Methods Used**

1. **`Integer.toString(num)`:**
   - Converts the input integer `num` into a string representation. For example, `1020` becomes `"1020"`.

2. **`StringBuilder`:**
   - A mutable sequence of characters used to efficiently append and modify characters during traversal.

3. **`charAt(i)`:**
   - Retrieves the character at index `i` in the string.

4. **`Integer.parseInt(result.toString())`:**
   - Converts the modified `StringBuilder` content back into an integer.

---

### **Execution Example**

#### Input:
```java
int num = 1020;
```

#### Execution Steps:

1. **Convert to String:**
   - `aa = "1020"`

2. **Traverse Each Character:**
   - `i = 0, aa.charAt(0) = '1'` → Append `'1'` → `result = "1"`
   - `i = 1, aa.charAt(1) = '0'` → Replace with `'5'` → `result = "15"`
   - `i = 2, aa.charAt(2) = '2'` → Append `'2'` → `result = "152"`
   - `i = 3, aa.charAt(3) = '0'` → Replace with `'5'` → `result = "1525"`

3. **Convert Back to Integer:**
   - `hi = Integer.parseInt("1525")`

4. **Return the Result:**
   - `hi = 1525`

---



