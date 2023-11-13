package ua.edu.ucu.apps.flowerstore.items.flowers;

import java.util.ArrayList;
import java.util.List;

import ua.edu.ucu.apps.flowerstore.items.Item;

public class FlowerBucket {
    private final List<FlowerPack> flowerPacks = new ArrayList<>();

    public double getPrice() {
        double price = 0;
        for (FlowerPack flowerPack : flowerPacks) {
            price += flowerPack.getPrice();
        }
        return price;
    }

    public String getDescription() {
        return "FLower Bucket description";
    }

    public void addFlowerPack(FlowerPack flowerPack) {
        this.flowerPacks.add(flowerPack);
    }
}
