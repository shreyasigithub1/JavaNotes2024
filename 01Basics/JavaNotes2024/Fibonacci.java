import java.util.*;

 class Solution {
    
    // Fibonacci function that returns the nth Fibonacci number
    public static int Fibonacci(int n) {
        if (n <= 1) {
            return n;  // Base case for Fibonacci sequence
        }
        
        int a = 1, b = 1, c = 0;
        
        // Loop to calculate Fibonacci number
        for (int i = 2; i <= n; i++) {
            c = a + b;  // Fibonacci number is the sum of the previous two
            a = b;
            b = c;
        }
        
        return c;  // Return the nth Fibonacci number
    }

    public static void main(String[] args) {
        // Create a scanner object to take input
        Scanner sc = new Scanner(System.in);
        
        // Read the input value
        System.out.println("Input:");
        int n = sc.nextInt();

        // Call the Fibonacci function and print the result
        int result = Fibonacci(n);
        System.out.println(result);
        
        // Close the scanner object
        sc.close();
    }
}

