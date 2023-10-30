package ua.edu.ucu.apps.flowerstore.items.flowers;

import lombok.Getter;

@Getter
public class FlowerPack {
    private final Flower flower;
    public int quantity;

    public FlowerPack(Flower flower, int quantity) {
        this.flower = new Flower(flower);  // copy constructor
        this.quantity = quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = Math.max(quantity, 1);
    }

    public double getPrice() {
        return flower.getPrice() * quantity;
    }

    @Override
    public String toString() {
        return "FlowerPack{" +
        "Flower{" +
        flower.toString() +
        ", Quantity=" +
        quantity + "}";
    }
}
