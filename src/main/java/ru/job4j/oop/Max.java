package ru.job4j.oop;

public class Max {
    public static int max(int left, int right) {
        return left >= right ? left : right;
    }

    public static int max(int first, int second, int third) {
        return max(first, max(second, third));
    }

    public static int max(int first, int second, int third, int fourth) {
        return max(max(first, second), max(third, fourth));
    }

    public static void main(String[] args) {
        System.out.println(max(1, 2));
        System.out.println(max(2, 1));
        System.out.println(max(1, 1));
    }
}
