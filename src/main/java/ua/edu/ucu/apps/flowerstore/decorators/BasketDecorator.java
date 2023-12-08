package ua.edu.ucu.apps.flowerstore.decorators;

public class BasketDecorator extends BasicDecorator {

    public BasketDecorator(BasicDecorator item) {
        super(item);
    }

    @Override
    public double getPrice() {
        return 4 + super.getPrice();
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "Basket included.";
    }
}
