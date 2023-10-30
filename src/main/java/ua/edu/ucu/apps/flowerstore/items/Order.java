package ua.edu.ucu.apps.flowerstore.items;

import java.util.LinkedList;

import ua.edu.ucu.apps.flowerstore.delivery_strategies.Delivery;

import ua.edu.ucu.apps.flowerstore.payment_strategy.Payment;
import ua.edu.ucu.apps.flowerstore.payment_strategy.CreditCardPaymentStrategy;
import ua.edu.ucu.apps.flowerstore.payment_strategy.PayPalPaymentStrategy;

public class Order {
    private final LinkedList<Item> items;
    private Payment payment;
    private Delivery delivery;

    public Order(LinkedList<Item> items) {
        this.items = items;
    }

    public void setPaymentStrategy(Payment paymentStrategy) {
        this.payment = paymentStrategy;
    }

    public void setDeliveryStrategy(Delivery deliveryStrategy) {
        this.delivery = deliveryStrategy;
    }

    public double calculateTotalPrice() {
        if (this.payment instanceof PayPalPaymentStrategy) {
            System.out.println("You paid with PayPal");
        } else if (this.payment instanceof CreditCardPaymentStrategy) {
            System.out.println("You paid with your credit card");
        }
        return 0;
    }

    public void processOrder() {
        double price = calculateTotalPrice();
        System.out.println("You successfully paid $" + price);
        System.out.println("Your package is being delivered now");
        delivery.deliver(items);
    }

    public void addItem(Item item) {
        this.items.add(0, item);
    }

    public void removeItem(Item item) {
        this.items.remove(item);
    }
}
