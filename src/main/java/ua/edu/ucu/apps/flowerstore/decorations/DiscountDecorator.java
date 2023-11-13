package ua.edu.ucu.apps.flowerstore.decorations;

import ua.edu.ucu.apps.flowerstore.items.Item;

public class DiscountDecorator extends ItemDecorator {
    public DiscountDecorator(Item item) {
        super(item);
    }

    @Override
    public double getPrice() {
        return super.getPrice() * 0.8;
    }
}
