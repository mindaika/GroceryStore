package com.clientdemo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // We'll need a grocery cart
        ShoppingCart myCart = new ShoppingCart();
        boolean keepShopping = true;

        // For Menu operations
        Scanner scanner = new Scanner(System.in);

        while(keepShopping) {
            System.out.println("\nChoose from these choices");
            System.out.println("-------------------------\n");
            System.out.println("1 - Add bananas to cart");
            System.out.println("2 - Add plantains to cart");
            System.out.println("3 - Add carrots to cart");
            System.out.println("5 - List items in cart, by subtotal");
            System.out.println("6 - List items in cart, by name");
            System.out.println("7 - Remove bananas from cart");
            System.out.println("8 - Empty your cart");
            System.out.println("9 - Checkout");
            System.out.println("0 - Quit Shopping");

            // Don't forget to control for non-numeric input
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // I mean it's one banana Michael, what could it cost?
                    myCart.addItem( new GroceryProduct("Banana", "ea", 1, (float)10.00));
                    break;
                case 2:
                    // I mean it's seven plantains Lucille, what could it cost?
                    myCart.addItem( new GroceryProduct("Plantain", "ea", 7, (float)0.63));
                    break;
                case 3:
                    // I mean it's three feet of carrots Gob, what could it cost?
                    myCart.addItem( new GroceryProduct("Carrot", "ft", 3, (float)112.18));
                    break;
                case 5:
                    myCart.listItemsBySubtotal();
                    break;
                case 6:
                    myCart.listItemsByName();
                    break;
                case 7:
                    myCart.removeItem("Banana");
                    break;
                case 8:
                    myCart.clear();
                    break;
                case 9:
                    myCart.checkout();
                    break;
                case 0:
                    // IntelliJ complains about infinite loops
                    keepShopping = false;
                default:
            }
        }
    }
}
