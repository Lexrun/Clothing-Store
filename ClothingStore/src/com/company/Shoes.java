package com.company;

public class Shoes extends Product {

    public Shoes(String name, String Brand, double Price, int size, String Color) {
        super(name, Brand, Price, size, Color);

    }
    @Override
    protected void checksize(int size) {
        while (size < 39 || size > 46 )
        {
            System.out.println("Incorrect size of Shoes");
            System.exit(0);
        }
    }
}
