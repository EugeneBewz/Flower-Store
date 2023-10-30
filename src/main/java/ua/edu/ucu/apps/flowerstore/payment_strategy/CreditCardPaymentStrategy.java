package ua.edu.ucu.apps.flowerstore.payment_strategy;

public class CreditCardPaymentStrategy implements Payment {
    public boolean isSignedIn;

    // Collect user data after which payment will be available

    @Override
    public boolean pay(double price) {
        if (isSignedIn) {
            System.out.println("Credit card payment went successfully!");
            return true;
        } else {
            System.out.println("Something went wrong... Check whether you are signed in.");
            return false;
        }
    }

    // * This method will change status to true
    // * if user data matches the one in data base
    // private void setSignInStatus(boolean status) {
    //     this.isSignedIn = status;
    // }
}
