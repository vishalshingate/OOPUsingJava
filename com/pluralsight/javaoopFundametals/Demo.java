package com.pluralsight.javaoopFundametals;

public class Demo {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        Product toothBrush = new Product("ToothBrush",1200);
        Product babyNapkin = new Product("BabyNapkin", 300);

        cart.addProduct(toothBrush);
        cart.addProduct(babyNapkin);
        System.out.println(cart);
        System.out.println("total cost of the cart:-"+ cart.getTotalCost());

    }
}
