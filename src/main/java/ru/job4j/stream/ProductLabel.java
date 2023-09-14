package ru.job4j.stream;

import java.util.List;

public class ProductLabel {
    public List<String> generateLabels(List<Product> products) {
        return products.stream()
                .filter(item -> item.getStandard() - item.getActual() <= 3)
                .map(item -> new Label(item.getName(), (item.getPrice() * 0.5f)).toString())
                .toList();
    }
}