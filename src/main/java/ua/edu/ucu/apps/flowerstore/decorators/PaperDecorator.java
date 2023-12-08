package ua.edu.ucu.apps.flowerstore.decorators;

public class PaperDecorator extends BasicDecorator {
    public PaperDecorator(BasicDecorator item) {
        super(item);
    }

    @Override
    public double getPrice() {
        return 13 + super.getPrice();
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "Paper included.";
    }
}
