package com.company;

public class Shirt extends Product {


    private int sale;
    public int getSale() {
        return sale;
    }
    public Shirt(String name, String Brand, double Price, String Size, String Color) {
        super(name, Brand, Price, Size, Color);

    }

    @Override
    protected void checkSize(String Size) {
        boolean result = sizes.contains(Size);
        while (result != true) {

            System.out.println("Incorrect size of Shirt");
            System.exit(0);
        }
    }
}