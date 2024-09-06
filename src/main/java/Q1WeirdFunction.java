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
        // TODO: Implement the iterative function
        if (n<3){
            return n;
        }
        else { 
            int f1 = 0;
            int f2 = 1;
            int f3 = 2;
            int result = 0;

            for(int i = 3; i<=n; i++){
                result = f1 + 2*f2 + 3*f3;
                f3 = f2;
                f2 = f1;
                f1 = result;
            }
            return result;
        }
    }
    public static void main(String [] args){
        int n = 4;
        // Test recursive implementation
        int resultRecursive = fRecursive(n);
        System.out.println("Recursive result for f(" + n + ") = " + resultRecursive);

        // Test iterative implementation
        int resultIterative = fIterative(n);
        System.out.println("Iterative result for f(" + n + ") = " + resultIterative);
    }
}