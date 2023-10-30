package ua.edu.ucu.apps.flowerstore.decorations;

import ua.edu.ucu.apps.flowerstore.items.Item;

public abstract class ItemDecorator extends Item {
    protected ItemDecorator(String description) {
        super(description);
    }

    public abstract String getDescription();
}
