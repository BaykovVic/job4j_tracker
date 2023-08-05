package ru.job4j.oop;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.oop.Point;

public class PointTest {
    @Test
    public void when00to20then2() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when20to00then2() {
        Point a = new Point(2, 0);
        Point b = new Point(0, 0);
        double expected = 2;
        int x1 = 2;
        int y1 = 0;
        int x2 = 0;
        int y2 = 0;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when02to00then2() {
        Point a = new Point(0, 2);
        Point b = new Point(0, 0);
        double expected = 2;
        int x1 = 0;
        int y1 = 2;
        int x2 = 0;
        int y2 = 0;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when00to02then2() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 0;
        int y2 = 2;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }
}
