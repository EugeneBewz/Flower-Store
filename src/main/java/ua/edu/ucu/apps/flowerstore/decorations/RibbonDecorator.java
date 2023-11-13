package ua.edu.ucu.apps.flowerstore.decorations;

import ua.edu.ucu.apps.flowerstore.items.Item;

public class RibbonDecorator extends ItemDecorator {
    public Item item;

    public RibbonDecorator(Item item) {
        super(item);
    }

    @Override
    public double getPrice() {
        return 13 + item.getPrice();
    }

    @Override
    public String getDescription() {
        return item.getDescription();
    }
}
