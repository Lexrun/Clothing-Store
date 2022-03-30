package com.company;
import java.lang.*;
import java.time.LocalDate;

public abstract class Product {
    private String name;
    private String Brand;
    private double Price;
    private String Size;
    private int size;
    private String Color;

    public String getName() {
        return name;
    }

    public String getBrand() {
        return Brand;
    }

    public double getPrice() {
        return Price;
    }

    public String getSize() {
        return Size;
    }

    public String getColor() {
        return Color;
    }

    public String getSizes() {
        return sizes;
    }

    public String sizes = " XS S M L XL 2XL";

    public Product(String name, String Brand, double Price, String Size, String Color) {
        checkSize(Size);
        this.name = name;
        this.Brand = Brand;
        this.Price = Price;
        this.Size = Size;
        this.Color = Color;
    }

    public Product(String name, String Brand, double Price, int size, String Color) {
        checksize(size);

        this.name = name;
        this.Brand = Brand;
        this.Price = Price;
        this.size = size;
        this.Color = Color;
    }

    protected void checkSize(String Size) {
        boolean result = sizes.contains(this.Size);
        while (result != true) {
            System.out.println(this.Size);
            System.out.println("Incorrect size of");
            System.exit(0);
        }
    }

    protected void checksize(int size) {
        while (size < 39 || size > 46 && size % 2 != 0) {
            System.out.println("Incorrect size of " + name);
            System.exit(0);
        }
    }

}




