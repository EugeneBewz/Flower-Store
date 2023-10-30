package ua.edu.ucu.apps.flowerstore.decorations;

import ua.edu.ucu.apps.flowerstore.items.Item;

public class BasketDecorator extends ItemDecorator {
    private final Item item;

    protected BasketDecorator(String description, Item item) {
        super(description);
        this.item = item;
    }

    public double getPrice() {
        return 4 + item.price();
    }

    public String getDescription() {
        return item.getDescription();
    }

    @Override
    public double price() {
        return 13 + item.price();
    }
}
