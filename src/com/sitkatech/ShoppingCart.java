package com.sitkatech;

import java.util.*;

class SubtotalSort implements Comparator<GroceryProduct> {
    @Override
    public int compare(GroceryProduct o1, GroceryProduct o2) {
        return(Float.compare(o1.getSubtotal(), o2.getSubtotal()));
    }
}

class ShoppingCart {
    private TreeMap<String, GroceryProduct> cartItems = new TreeMap<>();

    // A little more tricky
    void listItemsBySubtotal() {
        // Clumsy, but functional
        TreeSet<GroceryProduct> groceryProductsBySubtotal = new TreeSet<>(new SubtotalSort());
        for (Map.Entry<String,GroceryProduct> entry : cartItems.entrySet()) {
            groceryProductsBySubtotal.add(entry.getValue());
        }
        for (GroceryProduct gp: groceryProductsBySubtotal) {
            StringBuilder output = new StringBuilder();
            output.append(gp.getQuantity());
            output.append(gp.getUnits());
            output.append(" ");
            output.append(gp.getName());
            output.append(" @ $");
            output.append(gp.getPrice());
            output.append(" = $");
            output.append(gp.getSubtotal());
            System.out.println(output);
        }
    }

    // Since we went with the TreeMap, objects are default sorted by Key(name)
    void listItemsByName() {
        for (String item: cartItems.keySet()) {
            GroceryProduct thisProduct = cartItems.get(item);
            StringBuilder output = new StringBuilder();
            output.append(thisProduct.getQuantity());
            output.append(thisProduct.getUnits());
            output.append(" ");
            output.append(thisProduct.getName());
            output.append(" @ $");
            output.append(thisProduct.getPrice());
            output.append(" = $");
            output.append(thisProduct.getSubtotal());
            System.out.println(output);
        }
    }

    void addItem(GroceryProduct product) {
        // If we already have some in the cart, just update the quantity
        if(cartItems.containsKey(product.getName())) {
            int currentQuantity = cartItems.get(product.getName()).getQuantity();
            cartItems.get(product.getName()).setQuantity(currentQuantity + product.getQuantity());
        } else {
            cartItems.put(product.getName(), product);
        }
    }

    // This removes all items of a given name, regardless of quantity
    void removeItem(String product) {
        if(cartItems.containsKey(product)) {
            cartItems.remove(product);
        }
    }

    void clear() {
        cartItems.clear();
    }

    // This is Braintree/Paypal's create method, mostly included as proof-of-concept
    void checkout() {
//        PaymentMethodRequest request = new PaymentMethodRequest()
//                .customerId("131866")
//                .paymentMethodNonce(nonceFromTheClient);
//
//        Result<? extends PaymentMethod> result = gateway.paymentMethod().create(request);
    }
}