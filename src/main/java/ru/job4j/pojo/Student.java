package ru.job4j.pojo;

import java.time.LocalDateTime;

public class Student {
    private String name;
    private String secondName;
    private String thirdName;
    private String group;

    private LocalDateTime dataOfEntrance;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getThirdName() {
        return thirdName;
    }

    public void setThirdName(String thirdName) {
        this.thirdName = thirdName;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public LocalDateTime getDataOfEntrance() {
        return dataOfEntrance;
    }

    public void setDataOfEntrance(LocalDateTime dataOfEntrance) {
        this.dataOfEntrance = dataOfEntrance;
    }
}
