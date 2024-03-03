package Shake_e_Shahenshah;

import Shake_e_Shahenshah.Builder.ShakeBuilder;
import Shake_e_Shahenshah.Builder.Waiter;
import Shake_e_Shahenshah.Director.DirectorOfBuilders;
import Shake_e_Shahenshah.Manager.OrderManager;
import Shake_e_Shahenshah.Shakes.Shake;
import Shake_e_Shahenshah.Shakes.ShakeType;

import java.util.Scanner;

// Main Program
public class ShakeShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DirectorOfBuilders director = new DirectorOfBuilders();
        OrderManager orderManager = OrderManager.getInstance();
        ShakeBuilder builder = new Waiter();

        char choice;
        do {
            System.out.println("Press 'o' to open an order, 'e' to close the current order, or 'q' to quit:");
            choice = scanner.next().charAt(0);

            switch (choice) {
                case 'o':
                    orderManager.openOrder();
                    break;
                case 'e':
                    orderManager.closeOrder();
                    break;
                case 'q':
                    System.out.println("Quitting the Shake Shop program.");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }

            if (choice == 'o') {
                System.out.println("Choose a shake type (e.g., Chocolate, Coffee, Strawberry, Vanilla, Zero):");
                String type = scanner.next();

                ShakeType shakeType;
                if (type.equalsIgnoreCase("Chocolate")) {
                    shakeType = ShakeType.CHOCOLATE_SHAKE;
                }
                else if (type.equalsIgnoreCase("Coffee")) {
                    shakeType = ShakeType.COFFEE_SHAKE;
                }
                else if (type.equalsIgnoreCase("Strawberry")) {
                    shakeType = ShakeType.STRAWBERRY_SHAKE;
                }
                else if (type.equalsIgnoreCase("Vanilla")) {
                    shakeType = ShakeType.VANILLA_SHAKE;
                }
                else if (type.equalsIgnoreCase("Zero")) {
                    shakeType = ShakeType.ZERO_SHAKE;
                }
                else {
                    System.out.println("Invalid shake type. Try again.");
                    continue;
                }

                Shake shake = director.makeShake(builder, shakeType);
                orderManager.addToOrder(shake);
            }

        } while (choice != 'q');
    }
}
