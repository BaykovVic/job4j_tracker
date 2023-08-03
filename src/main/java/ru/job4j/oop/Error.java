package ru.job4j.oop;

public class Error {
    private boolean active;
    private int status;
    private String message;

    public Error() {
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printInfo() {
        System.out.println("Компьютер работает: " + active);
        System.out.println("Статус компьютера:  " + status);
        System.out.println("Сообщение компьютера: " + message);
    }

    public static void main(String[] args) {
        Error workingGood = new Error(true, 1, "работает");
        workingGood.printInfo();
        System.out.println("-------");
        Error notWorking = new Error(false, 0, "не работает");
        notWorking.printInfo();
    }
}