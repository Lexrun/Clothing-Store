package com.company;

import java.time.LocalDate;

public class Jacket extends Product {

    public Jacket(String name, String Brand, double Price, int size, String Color) {
        super(name, Brand, Price, size, Color);
    }
        @Override
        protected void checksize ( int size){
            while (size < 42 || size > 66 && size % 2 != 0) {
                System.out.println("Incorrect size of Jacket");
                System.exit(0);
            }
        }

    }