package Shake_e_Shahenshah.Builder;

import Shake_e_Shahenshah.Shakes.AddOns;
import Shake_e_Shahenshah.Shakes.Shake;
import Shake_e_Shahenshah.Shakes.ShakeType;

import java.util.List;
import java.util.Scanner;

public class Waiter implements ShakeBuilder{
    private ShakeType shakeType;

    private double totalPrice;

    private List<String> ingredients;

    // setter
    @Override
    public void setShakeType(ShakeType shakeType) {
        this.shakeType = shakeType;
        this.totalPrice = shakeType.getBasePrice();
        this.ingredients = shakeType.getIngredients();
    }

//    public void setIngredients(List<String> ingredients) {
//        this.ingredients = ingredients;
//    }
//
//    public void setTotalPrice(double totalPrice) {
//        this.totalPrice = totalPrice;
//    }


    @Override
    public void addMilk() {
        ingredients.add("Milk");
    }

    @Override
    public void addSugar() {
        if(!(shakeType == ShakeType.ZERO_SHAKE))
        {
            ingredients.add("Sugar");
        }
    }

    @Override
    public void addAdditionalIngredients() {
        ingredients.add(String.valueOf(shakeType.getIngredients()));
    }

    @Override
    public void makeLactoseFree() {
        ingredients.remove("Milk");
        ingredients.add("Almond Milk");
        totalPrice  += AddOns.ALMOND_MILK.getPrice();

    }

    @Override
    public void addCandy() {
        ingredients.add("Candy");
        totalPrice += AddOns.CANDY.getPrice();

    }

    @Override
    public void addCookies() {
        ingredients.add("Cookies");
        totalPrice += AddOns.COOKIES.getPrice();

    }
    @Override
    public void queryForAddOns() {
        // Additional ingredients can be added based on user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sire/Ma'am, We have varieties of addOns for you to choose from.");
        System.out.println("These days, many people are found to be lactose intolerant.");
        System.out.println("In that case, we have almond milk instead of regular milk for you.");

        System.out.println("Do you want to have lactose free shake for TK " + AddOns.ALMOND_MILK.getPrice() + " extra? (y/n)");
        if (scanner.next().equalsIgnoreCase("y")) {
            makeLactoseFree();
        }
        System.out.println("Thank you for your patience, Sire/Ma'am.");
        System.out.println("Now, let's move on to the toppings' section.");

        System.out.println("Would you mind telling us whether you want to add candy or not? (y/n)");
        if (scanner.next().equalsIgnoreCase("y")) {
            addCandy();
        }

        System.out.println("Thank you, Sire/Ma'am.");
        System.out.println("Kindly answer one last question, Sire/Ma'am.");

        System.out.println("Do you want to add cookies? (y/n)");
        if (scanner.next().equalsIgnoreCase("y")) {
            addCookies();
        }
    }

    @Override
    public Shake build() {
        return new Shake(shakeType, ingredients, totalPrice);
    }
}
