package ch.zhaw.iwi.devops.Calculator;

public class Squarecalculator {
    public int square(int number) {
        return number * number;
    }

    public int cube(int number) {
        return number * number * number;
    }

    public int add(int number1, int number2) {
        return number1 + number2;
    }

    public int subtract(int number1, int number2) {
        return number1 - number2;
    }

    public int multiply(int number1, int number2) {
        return number1 * number2;
    }

    public int divide(int number1, int number2) {
        if (number2 != 0) {
            return number1 / number2;
        } else {
            throw new IllegalArgumentException("Division by zero is not allowed");
        }
    }

    public int mod(int number1, int number2) {
        if (number2 != 0) {
            return number1 % number2;
        } else {
            throw new IllegalArgumentException("Modulo by zero is not allowed");
        }
    }

    public int power(int number, int exponent) {
        return (int) Math.pow(number, exponent);
    }

    public int max(int number1, int number2) {
        return Math.max(number1, number2);
    }

    public int min(int number1, int number2) {
        return Math.min(number1, number2);
    }

    public double sqrt(int number) {
        if (number >= 0) {
            return Math.sqrt(number);
        } else {
            throw new IllegalArgumentException("Square root of negative number is not defined");
        }
    }
}
