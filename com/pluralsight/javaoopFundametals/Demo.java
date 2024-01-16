package com.pluralsight.javaoopFundametals;

import javax.xml.catalog.Catalog;

public class Demo {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
       /* Product toothBrush = new Product("ToothBrush",1200);
        Product babyNapkin = new Product("BabyNapkin", 300);*/

        Product toothBrush = Catalogue.getProduct("Electric ToothBrush");
        Product babyAlarm = Catalogue.getProduct("Baby Alarm");
        cart.addProduct(toothBrush);
        cart.addProduct(babyAlarm);
        System.out.println(cart);
        System.out.println("total cost of the cart: "+ cart.getTotalCost());

    }
}
