//{ Driver Code Starts
// Initial template for Java

import java.io.*;
import java.util.*;

public class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String s = read.readLine();
            Solution ob = new Solution();

            System.out.println(ob.revStr(s));
        
System.out.println("~");
}
    }
}
// } Driver Code Ends


class Solution {
    static String revStr(String s) {
        // code here
        StringBuilder sb=new StringBuilder(s);
        return sb.reverse().toString();
    }
}