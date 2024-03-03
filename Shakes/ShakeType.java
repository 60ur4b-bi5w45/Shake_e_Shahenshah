package Shake_e_Shahenshah.Shakes;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public enum ShakeType {
    CHOCOLATE_SHAKE(230.0, "Chocolate syrup", "Chocolate ice-cream"),
    COFFEE_SHAKE(250.0, "Coffee", "Jello"),
    STRAWBERRY_SHAKE(200.0, "Strawberry syrup", "Strawberry ice-cream"),
    VANILLA_SHAKE(190.0, "Vanilla flavouring", "Jello"),
    ZERO_SHAKE(240.0, "Sweetener instead of sugar", "Vanilla flavouring","Sugar-free jello");

    private final double basePrice;
    private final List<String> ingredients;

    ShakeType(double basePrice, String... ingredients) {
        this.basePrice = basePrice;
        this.ingredients = new ArrayList<>();
        this.ingredients.addAll(Arrays.asList(ingredients));
    }

    public double getBasePrice() {
        return basePrice;
    }
    public List<String> getIngredients() {
        return ingredients;
    }

}
