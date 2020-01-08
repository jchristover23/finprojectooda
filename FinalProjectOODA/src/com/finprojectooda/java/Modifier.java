package com.finprojectooda.java;

public class Modifier {

    int Discount(int subtotal, int discount) {
        return subtotal * (100 - discount) / 100;
    }

    int Tax(int subtotal) {
        return subtotal * 110 / 100;
    }
}
