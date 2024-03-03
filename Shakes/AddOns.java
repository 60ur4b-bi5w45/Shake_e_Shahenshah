package Shake_e_Shahenshah.Shakes;

public enum AddOns {
    ALMOND_MILK(60.0),
    CANDY(50.0),
    COOKIES(40.0);

    public final double price;

    AddOns(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
