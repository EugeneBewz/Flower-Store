package ua.edu.ucu.apps.flowerstore.decorators;

public class DiscountDecorator extends BasicDecorator {
    public DiscountDecorator(BasicDecorator item) {
        super(item);
    }

    @Override
    public double getPrice() {
        return super.getPrice() * 0.8;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "Discount (80%) applied.";
    }
}
