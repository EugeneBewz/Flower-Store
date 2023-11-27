package ua.edu.ucu.apps.flowerstore.decorators;

public class PaperDecorator implements ItemDecorator {
    public ItemDecorator item;

    public PaperDecorator(ItemDecorator item) {
        this.item = item;
    }

    @Override
    public double getPrice() {
        return 13 + item.getPrice();
    }

    @Override
    public String getDescription() {
        return item.getDescription() + "Paper included.";
    }
}
