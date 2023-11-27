package ua.edu.ucu.apps;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import ua.edu.ucu.apps.flowerstore.decorators.ItemDecorator;
import ua.edu.ucu.apps.flowerstore.decorators.RibbonDecorator;
import ua.edu.ucu.apps.flowerstore.items.flowers.Flower;
import ua.edu.ucu.apps.flowerstore.items.flowers.FlowerColor;
import ua.edu.ucu.apps.flowerstore.items.flowers.FlowerType;

public class DecoratorTest {
    @Test
    public void testGetPrice() {
        Flower flower = new Flower(0L, FlowerType.ROSE, 120, 30, FlowerColor.RED.toString(), "A red rose");

//        ItemDecorator baseItem = new ItemDecorator(flower);
//        RibbonDecorator ribbonDecoratedItem = new RibbonDecorator(baseItem);

//        double expectedPrice = 40 + baseItem.getPrice();
//        assertEquals(expectedPrice, ribbonDecoratedItem.getPrice(), 0.01);
    }

}
