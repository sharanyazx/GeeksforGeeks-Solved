//{ Driver Code Starts
import java.util.*;

// Define MyStack class here

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        scanner.nextLine(); // Flush the newline character left by nextInt
        while (T-- > 0) {
            MyStack sq = new MyStack();
            String line = scanner.nextLine();
            Scanner ss = new Scanner(line);
            List<Integer> nums = new ArrayList<>();
            while (ss.hasNextInt()) {
                int num = ss.nextInt();
                nums.add(num);
            }
            int n = nums.size();
            int i = 0;
            while (i < n) {
                int QueryType = nums.get(i++);
                if (QueryType == 1) {
                    int a = nums.get(i++);
                    sq.push(a);
                } else if (QueryType == 2) {
                    System.out.print(sq.pop() + " ");
                }
            }
            System.out.println();
        
System.out.println("~");
}
        scanner.close();
    }
}

// } Driver Code Ends


class MyStack {
    private int[] arr;
    private int top;

    // Constructor to initialize stack
    public MyStack() {
        arr = new int[1000]; // Stack of size 1000
        top = -1;            // Stack is empty initially
    }

    // Function to push an element into the stack
    public void push(int x) {
        // Check for stack overflow
        if (top >= arr.length - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        
        // Insert element and increment top
        top++;
        arr[top] = x;
    }

    // Function to pop an element from the stack
    public int pop() {
        // Check for stack underflow
        if (top == -1) {
            //System.out.println(-1);
            return -1; // Return -1 to indicate error
        }

        // Return the top element and decrease top
        int poppedElement = arr[top];
        top--;
        return poppedElement;
    }
}
