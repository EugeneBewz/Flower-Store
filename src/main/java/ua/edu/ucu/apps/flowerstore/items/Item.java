package ua.edu.ucu.apps.flowerstore.items;

import lombok.Getter;

@Getter
public abstract class Item {
    private final double price;
    private final String description;

    public Item(double price, String description) {
        this.price = price;
        this.description = description;
    }
}
