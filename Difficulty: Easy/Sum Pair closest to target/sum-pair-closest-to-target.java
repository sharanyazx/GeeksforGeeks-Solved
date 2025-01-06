//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

public class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {

            String line = br.readLine();
            String[] tokens = line.split(" ");

            ArrayList<Integer> array = new ArrayList<>();

            for (String token : tokens) {
                array.add(Integer.parseInt(token));
            }

            int[] arr = new int[array.size()];
            int idx = 0;
            for (int i : array) arr[idx++] = i;

            int target = Integer.parseInt(br.readLine());

            Solution ob = new Solution();
            List<Integer> res = ob.sumClosest(arr, target);
            if (res.isEmpty()) {
                System.out.print("[]");
            } else {
                for (Integer num : res) {
                    System.out.print(num + " ");
                }
            }
            System.out.println();
            System.out.println("~");
        }
    }
}
// } Driver Code Ends



class Solution {
    public List<Integer> sumClosest(int[] arr, int target) {
        // Handle edge case: If the array has fewer than 2 elements
        if (arr == null || arr.length < 2) {
            return new ArrayList<>(); // Return an empty list
        }

        // Step 1: Sort the array
        Arrays.sort(arr);

        // Step 2: Initialize pointers and variables
        int left = 0;
        int right = arr.length - 1;
        int closestSum = arr[left] + arr[right]; // Initial closest sum
        int pair1 = arr[left], pair2 = arr[right];

        // Step 3: Use the two-pointer approach
        while (left < right) {
            int currentSum = arr[left] + arr[right];

            // Update closest sum and pair if a closer sum is found
            if (Math.abs(target - currentSum) < Math.abs(target - closestSum)) {
                closestSum = currentSum;
                pair1 = arr[left];
                pair2 = arr[right];
            }

            // Adjust pointers based on comparison with target
            if (currentSum < target) {
                left++; // Move left pointer to increase sum
            } else {
                right--; // Move right pointer to decrease sum
            }
        }

        // Step 4: Return the pair as a list
        List<Integer> result = new ArrayList<>();
        result.add(pair1);
        result.add(pair2);
        return result;
    }

    
}
