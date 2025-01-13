//{ Driver Code Starts
//Initial Template for Java

//Initial Template for Java


import java.io.*;
import java.util.*;


class Array {
	public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int a[] = new int[n];
            
            for(int i=0;i<n;i++){
                a[i] = sc.nextInt();
            }
            
            Solution ob = new Solution();
            
            System.out.println(ob.findSum(a,n));
        
System.out.println("~");
}
        
	}
}
// } Driver Code Ends


//User function Template for Java

class Solution
{ 
    public static int findSum(int A[],int N) 
    {
        if(N==1) return A[0]+A[0]; 
        int max=A[0];
        int min=A[0];
        for(int i:A){
            if(max<i) {
                max=i;
            }
            if(min>i) {
                min=i;
            }
        }
        return max+min;
    }
}