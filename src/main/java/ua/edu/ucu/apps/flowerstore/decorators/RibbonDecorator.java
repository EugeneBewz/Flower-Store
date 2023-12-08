package ua.edu.ucu.apps.flowerstore.decorators;

public class RibbonDecorator extends BasicDecorator {
    public RibbonDecorator(BasicDecorator item) {
        super(item);
    }

    @Override
    public double getPrice() {
        return 40 + super.getPrice();
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "Ribbon included.";
    }
}
