// src/main/java/Q1WeirdFunction.java

public class Q1WeirdFunction {

    public static int fRecursive(int n) {
        // TODO: Implement the recursive function
        if(n<3){
            return n;
        }
        else{
            return fRecursive(n-1) + 2*fRecursive(n-2) + 3*fRecursive(n-3);
        }
    }

    public static int fIterative(int n) {
        // Handle base cases
        if (n < 3) {
            return n;
        }
    
        // Use variables to store intermediate results
        int f3 = 0; // f(n-3)
        int f2 = 1; // f(n-2)
        int f1 = 2; // f(n-1)
        int fn = 0;       // f(n)
    
        // Compute f(n) iteratively for n >= 3
        for (int i = 3; i <= n; i++) {
            fn = f1 + 2 * f2 + 3 * f3;
    
            // Update variables for the next iteration
            f3 = f2;
            f2 = f1;
            f1 = fn;
        }
    
        return fn;
    }
    
    public static void main(String [] args){
        int n = 3;
        // Test recursive implementation
        int resultRecursive = fRecursive(n);
        System.out.println("Recursive result for f(" + n + ") = " + resultRecursive);

        // Test iterative implementation
        int resultIterative = fIterative(n);
        System.out.println("Iterative result for f(" + n + ") = " + resultIterative);
    }
}