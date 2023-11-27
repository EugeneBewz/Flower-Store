package ua.edu.ucu.apps.flowerstore.decorators;

public class RibbonDecorator implements ItemDecorator {
    public ItemDecorator item;

    public RibbonDecorator(ItemDecorator item) {
        this.item = item;
    }

    @Override
    public double getPrice() {
        return 40 + item.getPrice();
    }

    @Override
    public String getDescription() {
        return item.getDescription() + "Ribbon included.";
    }
}
