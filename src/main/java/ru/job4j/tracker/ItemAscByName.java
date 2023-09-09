package ru.job4j.tracker;

import java.util.Comparator;

public class ItemAscByName implements Comparator<Item> {
    @Override
    public int compare(Item leftItem, Item rightItem) {
        return leftItem.getName().compareTo(rightItem.getName());
    }
}
