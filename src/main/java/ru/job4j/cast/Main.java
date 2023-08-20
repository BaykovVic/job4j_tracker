package ru.job4j.cast;

public class Main {
    public static void main(String[] args) {
        Vehicle plane1 = new Plane();
        Vehicle train1 = new Train();
        Vehicle bus1 = new Bus();
        Vehicle plane2 = new Plane();
        Vehicle train2 = new Train();
        Vehicle bus2 = new Bus();
        Vehicle plane3 = new Plane();
        Vehicle train3 = new Train();
        Vehicle bus3 = new Bus();

        Vehicle[] vehicles = {plane1, train1, bus1, plane2, train2, bus2, plane3, train3, bus3};
        for (Vehicle vehicle : vehicles) {
            vehicle.move();
        }
    }
}
