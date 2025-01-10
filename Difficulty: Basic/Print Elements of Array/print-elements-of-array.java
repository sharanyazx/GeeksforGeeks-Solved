//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            String[] str = br.readLine().trim().split(" ");
            int n = str.length;
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(str[i]);
            }

            new Solution().printArray(arr);
            System.out.println();
        
System.out.println("~");
}
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    // Function to print all elements of the array space-separated
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

    public static void main(String[] args) {
        Solution obj = new Solution();
        int arr1[] = {1, 2, 3, 4, 5};
        obj.printArray(arr1); 
    }
}
