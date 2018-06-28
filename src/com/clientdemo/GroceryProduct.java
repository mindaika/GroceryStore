package com.clientdemo;

class GroceryProduct {
    private String name;
    private String units;
    private int quantity;
    private float price;
    private float subtotal;

    GroceryProduct(String name, String units, int quantity, float price) {
        this.name = name;
        this.units = units;
        this.quantity = quantity;
        this.price = price;
        this.subtotal = quantity * price;
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    String getUnits() {
        return units;
    }

    void setUnits(String units) {
        this.units = units;
    }

    int getQuantity() {
        return quantity;
    }

    void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    float getPrice() {
        return price;
    }

    void setPrice(float price) {
        this.price = price;
    }

    float getSubtotal() {
        this.subtotal = this.quantity * this.price;
        return this.subtotal;
    }
}
