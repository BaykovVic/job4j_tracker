package ru.job4j.pojo;

import java.time.LocalDateTime;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Ivan");
        student.setSecondName("Ivanov");
        student.setThirdName("Ivanovich");
        student.setGroup("B1-01");
        student.setDataOfEntrance(LocalDateTime.now());
    }
}
