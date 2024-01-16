package com.pluralsight.javaoopFundametals;

public class Customer {
    private final String name;

    private CreditCard creditCard;

    public Customer(String name, CreditCard creditCard) {
        this.name = name;
        this.creditCard = creditCard;
    }
}
