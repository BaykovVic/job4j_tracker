package ru.job4j.checkstyle;

public class Broken {
    public static final String NEW_VALUE = "";
    public String surname;
    private int sizeOfEmpty = 10;

    private String name;

    Broken() {
    }

    private void echo() { }

    private void media(Object obj) {
        if (obj != null) {
            System.out.println(obj);
        }
    }

    private void method(int a, int b, int c, int d, int e, int f, int g) {
    }

}