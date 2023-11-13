package ua.edu.ucu.apps.flowerstore.decorations;

import ua.edu.ucu.apps.flowerstore.items.Item;

public abstract class ItemDecorator extends Item {
    public Item item;
    public ItemDecorator(Item item) {
        this.item = item;
    }

    @Override
    public String getDescription() {
        return item.getDescription();
    }

    @Override
    public double getPrice() {
        return item.getPrice();
    }
}
