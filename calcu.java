import java.util.Scanner;

public class calcu {
    
    // Addition method
    public static int add(int a, int b) {
        return a + b;
    }

    // Subtraction method
    public static int subtract(int a, int b) {
        return a - b;
    }

        // Multiplication method
        public static int multiply(int a, int b) {
            return a * b;
        }
    
    // Division method
    public static int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
           }
        return a / b;
    }
    
    // Modulus method
    public static int modulus(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Modulus by zero is not allowed.");
        }
        return a % b;
    }

}


