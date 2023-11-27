package ua.edu.ucu.apps.flowerstore.decorators;

public class DiscountDecorator implements ItemDecorator {
    public ItemDecorator item;

    public DiscountDecorator(ItemDecorator item) {
        this.item = item;
    }

    @Override
    public double getPrice() {
        return item.getPrice() * 0.8;
    }

    @Override
    public String getDescription() {
        return item.getDescription() + "Discount (80%) applied.";
    }
}
