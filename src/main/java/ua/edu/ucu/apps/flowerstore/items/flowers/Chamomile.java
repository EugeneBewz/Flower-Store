package ua.edu.ucu.apps.flowerstore.items.flowers;

public class Chamomile extends Flower {
    public Chamomile(Long id,
                     FlowerType flowerType,
                     double price,
                     double sepalLength,
                     FlowerColor color,
                     String description) {
        super(id, flowerType, price, sepalLength, color, description);
    }
}
