package Shake_e_Shahenshah.Manager;

import Shake_e_Shahenshah.Shakes.Shake;

import java.util.ArrayList;
import java.util.List;

// Singleton
public class OrderManager {
    private static OrderManager instance;
    private List<Shake> currentOrder;

    private OrderManager() {
        this.currentOrder = new ArrayList<>();
    }

    public static OrderManager getInstance() {
        if (instance == null) {
            instance = new OrderManager();
        }
        return instance;
    }

    public void openOrder() {
        currentOrder.clear();
        System.out.println("Order opened.");
    }

    public void closeOrder() {
        if (!(currentOrder.isEmpty())) {
            System.out.println("Order closed.");
            displayOrder();
        } else {
            System.out.println("Cannot close order. Add at least one item to the order.");
        }
    }

    public void addToOrder(Shake shake) {
        currentOrder.add(shake);
        System.out.println("Shake added to the order.");
    }

    private void displayOrder() {
        System.out.println("Order Details:");
        Shake shake;
        for(int i = 0; i < currentOrder.size(); i++) {
            shake = currentOrder.get(i);
            shake.display();
        }
        System.out.println("Total Price: Tk " + calculateTotalPrice());
    }

    private double calculateTotalPrice() {
        double totalPrice = 0;
        for (Shake shake : currentOrder) {
            totalPrice += shake.getTotalPrice();
        }
        return totalPrice;
    }
}
