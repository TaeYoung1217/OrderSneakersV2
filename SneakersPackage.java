package mission.OrderSneakersV2;

public class SneakersPackage {
    private Sneakers sneakers;

    public SneakersPackage() {
    }

    public void setSneakers(Sneakers sneakers) {
        this.sneakers = sneakers;
    }

    public Sneakers beUnBoxed() {
        return sneakers;
    }
}
