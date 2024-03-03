package Shake_e_Shahenshah.Shakes;

import java.util.ArrayList;
import java.util.List;

public class Shake {
    private List<String> ingredients;
    private ShakeType shakeType;

    private double totalPrice;

    public Shake(ShakeType shakeType, List<String> ingredients, double totalPrice) {
        this.shakeType = shakeType;
        this.ingredients = new ArrayList<>();
        this.ingredients.addAll(ingredients);
        this.totalPrice = totalPrice;
    }
    // getters
    public List<String> getIngredients() {
        return ingredients;
    }
    public ShakeType getShakeType() {
        return shakeType;
    }
    public void display() {
        System.out.println("Shake Type: " + shakeType);
        System.out.println("Base Price: Tk " + shakeType.getBasePrice());
        System.out.println("Ingredients: " + String.join(", ", ingredients));
        System.out.println("Price: Tk " + totalPrice);
    }

    public double getTotalPrice() {
        return totalPrice;
    }
}
