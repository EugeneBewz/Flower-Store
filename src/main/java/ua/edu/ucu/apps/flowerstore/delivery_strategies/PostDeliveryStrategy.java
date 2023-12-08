//package ua.edu.ucu.apps.flowerstore.delivery_strategies;
//
//import java.util.List;
//
//public class PostDeliveryStrategy implements Delivery{
//    private final String address;
//    private final String postOfficeNo;
//
//    public PostDeliveryStrategy(String address,
//                                String postOfficeNo) {
//        this.address = address;
//        this.postOfficeNo = postOfficeNo;
//    }
//
//    @Override
//    public void deliver(List<Item> items) {
//        System.out.println("Your order is being delivered via DHL");
//        System.out.println("Destination: " + address);
//        System.out.println("Your package will be delivered to post office №" + postOfficeNo);
//        System.out.println("Your order: " + items.toString());
//    }
//}
