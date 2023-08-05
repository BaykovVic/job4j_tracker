package ru.job4j.oop;

public class Calculator {
    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public int multiply(int y) {
        return x * y;
    }

    public static int minus(int y) {
        return x - y;
    }

    public int divide(int y) {
        return x / y;
    }

    public int sumAllOperation(int num) {
        return sum(num) + multiply(num) + divide(num) + minus(num);
    }

    public static void main(String[] args) {
        int result = sum(10);
        Calculator calculator = new Calculator();
        System.out.println("Sum: " + result);
        result = calculator.multiply(10);
        System.out.println("Multiply: " + result);
        result = minus(10);
        System.out.println("Sub: " + result);
        result = calculator.divide(5);
        System.out.println("Div: " + result);
        result = calculator.sumAllOperation(5);
        System.out.println("Sum All Operators: " + result);
    }
}
