package mission.OrderSneakersV2;

public class SilverCustomer extends Customer {
    public SilverCustomer(String customerName, Long cash, String sneakerModel, boolean likeDelivery) {
        super(customerName, cash, sneakerModel, likeDelivery);
        this.customerLevel = CustomerLevel.SILVER;
    }
}