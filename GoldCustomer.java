package mission.OrderSneakersV2;

public class GoldCustomer extends Customer {

    private double sneakerDisCountRatio = 0.1;
    private double deliveryDisCountRatio = 0.5;

    public GoldCustomer(String customerName, Long cash, String sneakerModel, boolean likeDelivery) {
        super(customerName, cash, sneakerModel, likeDelivery);
        this.customerLevel = CustomerLevel.GOLD;
    }

    @Override
    public long calculateNikePrice(long nikePrice) {
        System.out.printf("손님: 저 %s 등급이어서 운동화 할인 %.2f%% 되는 걸로 알고 있습니다.\n", this.customerLevel, this.sneakerDisCountRatio * 100);
        return Math.round(nikePrice * (1 - sneakerDisCountRatio)); // 10% 할 인
    }

    @Override
    public long calculateDeliveryCost(long cost) {
        System.out.printf("손님: 저 %s 등급이어서 배송 할인 %.2f%% 되는 걸로 알고 있습니다.\n", this.customerLevel, this.deliveryDisCountRatio * 100);
        return Math.round(cost * (1 - deliveryDisCountRatio)); // 50% 할 인
    }

}