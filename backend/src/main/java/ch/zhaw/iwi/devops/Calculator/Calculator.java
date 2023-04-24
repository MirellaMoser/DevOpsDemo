package ch.zhaw.iwi.devops.Calculator;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
    
    public int subtract(int a, int b) {
        return a - b;
    }
    
    public int multiply(int a, int b) {
        return a * b;
    }
    
    public int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed");
        }
        return a / b;
    }

    public int exponent(int a, int b) {
        return (int) Math.pow(a, b);
    }
    
    public int squareRoot(int a) {
        return (int) Math.sqrt(a);
    }
    
    public int modulo(int a, int b) {
        return a % b;
    }
}
