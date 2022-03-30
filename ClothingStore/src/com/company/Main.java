package com.company;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Product> cart = new ArrayList<>();
	Product BlueCottonShirt = new Shirt("Blue Cotton Shirt,","BrandA",49.99,"M","Blue");
    cart.add(BlueCottonShirt);
    Product RedSuedeShoes = new Shoes("Red Suede Shoes","BrandS",59.99,43,"Red");
    cart.add(RedSuedeShoes);
    Product RedLinenTrousers = new Trousers("Red Linen Trousers","BrandC",99.99,43,"Red");
    Product BlackCottonSuitJacket = new Jacket ("Black Cotton Suit Jacket","BrandJ",  59.99,50,"Black");
    cart.add(BlackCottonSuitJacket);
    LocalDate localdate  = LocalDate.of(2022, 3, 30);
    cart.add(RedLinenTrousers);

    System.out.println("Date: 2022-03-23 12:34:56");
    System.out.println("---Products---");
    Cashier cashier = new Cashier(cart,localdate);

    }
}
