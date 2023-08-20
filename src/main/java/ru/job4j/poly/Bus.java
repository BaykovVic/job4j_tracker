package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void move() {
        System.out.println("Bus move");
    }

    @Override
    public void getPassengers(int passengersCount) {
        System.out.println("Количество пассажиров: " + passengersCount);
    }

    @Override
    public float refuel(float fuel) {
        System.out.println("Автобус заправлен: " + fuel);
        return 0;
    }
}
