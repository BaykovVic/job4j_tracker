package ru.job4j.collection;

import java.util.HashMap;

public class UsageMap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("qwerty@qwerty.ru", "Vasya Pupkin");
        map.put("qwerty1@qwerty.ru", "Fedor Pupkin");
        map.put("qwerty2@qwerty.ru", "Ivan Pupkin");
        map.put("qwerty2@qwerty.ru", "Ignat Pupkin");
        for (String key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }

    }
}
