package ua.edu.ucu.apps;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import ua.edu.ucu.apps.flowerstore.decorators.*;

import ua.edu.ucu.apps.flowerstore.items.flowers.Flower;
import ua.edu.ucu.apps.flowerstore.items.flowers.FlowerColor;
import ua.edu.ucu.apps.flowerstore.items.flowers.FlowerType;

public class DecoratorTest {
    @Test
    public void testGetPrice1() {
        Flower flower = new Flower(0L, FlowerType.ROSE, 120, 30, FlowerColor.RED, "A red rose");

        BasicDecorator baseItem = new BasicDecorator(flower);

        double expectedPrice = 120;
        assertEquals(expectedPrice, baseItem.getPrice(), 0.01);
    }
    @Test
    public void testGetPrice2() {
        Flower flower = new Flower(0L, FlowerType.ROSE, 120, 30, FlowerColor.RED, "A red rose");

        BasicDecorator baseItem = new BasicDecorator(flower);
        RibbonDecorator ribbonDecoratedItem = new RibbonDecorator(baseItem);

        double expectedPrice = 40 + baseItem.getPrice();
        assertEquals(expectedPrice, ribbonDecoratedItem.getPrice(), 0.01);
    }

    @Test
    public void testGetPrice3() {
        Flower flower = new Flower(0L, FlowerType.ROSE, 120, 30, FlowerColor.RED, "A red rose");

        BasicDecorator baseItem = new BasicDecorator(flower);
        RibbonDecorator ribbonDecoratedItem = new RibbonDecorator(baseItem);
        BasketDecorator basketDecoratedItem = new BasketDecorator(ribbonDecoratedItem);

        double expectedPrice = 40 + 4 + baseItem.getPrice();
        assertEquals(expectedPrice, basketDecoratedItem.getPrice(), 0.01);

    }

    @Test
    public void testGetPrice4() {
        Flower flower = new Flower(0L, FlowerType.ROSE, 120, 30, FlowerColor.RED, "A red rose");

        BasicDecorator baseItem = new BasicDecorator(flower);
        RibbonDecorator ribbonDecoratedItem = new RibbonDecorator(baseItem);
        BasketDecorator basketDecoratedItem = new BasketDecorator(ribbonDecoratedItem);
        PaperDecorator paperDecoratedItem = new PaperDecorator(basketDecoratedItem);

        double expectedPrice = 40 + 4 + 13 + baseItem.getPrice();
        assertEquals(expectedPrice, paperDecoratedItem.getPrice(), 0.01);
    }

    @Test
    public void testGetPrice5() {
        Flower flower = new Flower(0L, FlowerType.ROSE, 120, 30, FlowerColor.RED, "A red rose");

        BasicDecorator baseItem = new BasicDecorator(flower);
        RibbonDecorator ribbonDecoratedItem = new RibbonDecorator(baseItem);
        BasketDecorator basketDecoratedItem = new BasketDecorator(ribbonDecoratedItem);
        PaperDecorator paperDecoratedItem = new PaperDecorator(basketDecoratedItem);
        DiscountDecorator itemWithDiscount = new DiscountDecorator(paperDecoratedItem);

        double expectedPrice = (40 + 4 + 13 + baseItem.getPrice()) * 0.8;
        assertEquals(expectedPrice, itemWithDiscount.getPrice(), 0.01);
    }
}
