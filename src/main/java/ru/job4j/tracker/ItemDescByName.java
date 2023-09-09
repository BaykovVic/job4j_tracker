package ru.job4j.tracker;

import java.util.Comparator;

public class ItemDescByName implements Comparator<Item> {
    @Override
    public int compare(Item leftItem, Item rightItem) {
        return rightItem.getName().compareTo(leftItem.getName());
    }
}
