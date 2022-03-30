package com.company;

public class Trousers extends Product {

    public Trousers(String name, String Brand, double Price, int size, String Color) {
        super(name, Brand, Price, size, Color);

    }

    @Override
    protected void checksize(int size) {
        while (size < 42 || size > 66 && size % 2 != 0) {
            System.out.println("Incorrect size of Trousers");
            System.exit(0);
        }
    }
}