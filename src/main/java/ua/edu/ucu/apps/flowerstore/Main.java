package ua.edu.ucu.apps.flowerstore;

import ua.edu.ucu.apps.flowerstore.items.flowers.Flower;
import ua.edu.ucu.apps.flowerstore.items.flowers.FlowerColor;
import ua.edu.ucu.apps.flowerstore.items.flowers.FlowerType;

public class Main {
    public static void main(String[] args) {
        Flower flower = new Flower(1L, FlowerType.ROSE, 10, 80, FlowerColor.RED.toString(), "Red Rose");
        System.out.println(flower);
    }
}
