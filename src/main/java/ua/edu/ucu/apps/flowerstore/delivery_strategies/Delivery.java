package ua.edu.ucu.apps.flowerstore.delivery_strategies;

import java.util.List;
import ua.edu.ucu.apps.flowerstore.items.Item;

public interface Delivery {
    void deliver(List<Item> items);
}
