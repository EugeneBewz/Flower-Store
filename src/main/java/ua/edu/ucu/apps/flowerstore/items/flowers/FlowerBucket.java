package ua.edu.ucu.apps.flowerstore.items.flowers;

import java.util.ArrayList;
import java.util.List;

import ua.edu.ucu.apps.flowerstore.items.Item;

public class FlowerBucket extends Item {
    private final List<FlowerPack> flowerPacks = new ArrayList<>();

    protected FlowerBucket(String description) {
        super(description);
    }

    @Override
    public double price() {
        double price = 0;
        for (FlowerPack flowerPack : flowerPacks) {
            price += flowerPack.getPrice();
        }
        return price;
    }

    public void addFlowerPack(FlowerPack flowerPack) {
        this.flowerPacks.add(flowerPack);
    }
}
