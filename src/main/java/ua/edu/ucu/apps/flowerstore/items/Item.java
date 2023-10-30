package ua.edu.ucu.apps.flowerstore.items;

import lombok.Getter;

@Getter
public abstract class Item {
    private final String description;

    protected Item(String description) {
        this.description = description;
    }

    public abstract double price();

}
