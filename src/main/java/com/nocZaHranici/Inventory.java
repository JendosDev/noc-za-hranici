package com.nocZaHranici;

import java.util.List;
import java.util.Map;

public class Inventory {
    private List<Item> items;
    private final int MAX_VALUE = 6;

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(Item item) {
        items.remove(item);
    }

    public boolean contains(Item item) {
        return false;
    }
}
