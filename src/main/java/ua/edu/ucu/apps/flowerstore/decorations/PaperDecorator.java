package ua.edu.ucu.apps.flowerstore.decorations;

import ua.edu.ucu.apps.flowerstore.items.Item;

public class PaperDecorator extends ItemDecorator {
    private final Item item;

    public PaperDecorator(Item item) {
        super(item.getDescription());
        this.item = item;
    }

    public double getPrice() {
        return 13 + item.price();
    }

    public String getDescription() {
        return item.getDescription();
    }

    @Override
    public double price() {
        return 13 + item.price();
    }
}
