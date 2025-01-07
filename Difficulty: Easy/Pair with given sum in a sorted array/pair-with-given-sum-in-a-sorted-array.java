//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;


// } Driver Code Ends
// User function Template for Java

class Solution {

    int countPairs(int arr[], int target) {
        // Complete the function
        int result=0, start=0, end=arr.length-1;
        while(start<end){
            int Sum = arr[start]+arr[end];
            if(Sum>target){
                end--;
            }
            else if(Sum<target){
                start++;
            }
            else {
                int e1 = arr[start], e2=arr[end], occur1=0, occur2=0;
                while(start<=end && arr[start] == e1){
                    start++;
                    occur1++;
                }
                while(start<=end && arr[end] == e2){
                    end--;
                    occur2++;
                }
                if(e1 == e2){
                    result+=(occur1*(occur1-1))/2;
                }
                else {
                    result+=occur1*occur2;
                }
            }
        }
        return result;
    }
}



//{ Driver Code Starts.
class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while (t-- > 0) {
            String[] inputLine = br.readLine().trim().split(" ");
            int[] arr = new int[inputLine.length];
            for (int i = 0; i < inputLine.length; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            inputLine = br.readLine().trim().split(" ");
            int target = Integer.parseInt(inputLine[0]);

            Solution obj = new Solution();
            int res = obj.countPairs(arr, target);
            System.out.println(res);
            System.out.println("~");
        }
    }
}
// } Driver Code Ends