//{ Driver Code Starts
import java.lang.Math;
import java.util.Scanner;

class Convert_To_Five {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            System.out.println(new Solution().convertfive(N));
            T--;
        
System.out.println("~");
}
    }
}
// } Driver Code Ends


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