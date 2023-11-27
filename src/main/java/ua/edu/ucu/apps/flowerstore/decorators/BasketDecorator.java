package ua.edu.ucu.apps.flowerstore.decorators;

public class BasketDecorator implements ItemDecorator {
    public ItemDecorator item;

    public BasketDecorator(ItemDecorator item) {
        this.item = item;
    }

    @Override
    public double getPrice() {
        return 4 + item.getPrice();
    }

    @Override
    public String getDescription() {
        return item.getDescription() + "Basket included.";
    }
}
