package ru.job4j.oop;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class Point {
    private int x;
    private int y;
    private int z;

    /**
     * Конструктор, который принимает начальное состояние объекта "точка"
     * @param x координата x
     * @param y координата y
     */
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double distance(Point otherPoint) {
        return sqrt(pow(otherPoint.x - this.x, 2) + pow(otherPoint.y - this.y, 2));
    }

    public double distance3D(Point otherPoint) {
        return sqrt(pow(otherPoint.x - this.x, 2) + pow(otherPoint.y - this.y, 2) + pow(otherPoint.z - this.z, 2));
    }

    public static void main(String[] args) {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double distance = a.distance(b);
        System.out.println(distance);
    }
}
