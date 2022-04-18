package com.company;
import java.time.LocalDate;
import java.util.List;
import java.text.DecimalFormat;

public class Cashier {
    private List<Product> cart;
    public double subtotal;
    public double discount;
    public double DISCOUNT;
    public double shoesdiscount;
    public double shirtsdiscount;
    public double WEDNESDAYDICOUNT;
    String Wednesday = "WEDNESDAY";
    DecimalFormat df = new DecimalFormat("#.00");
    public Cashier(List<Product> cart,LocalDate localdate)
    {
        for(Product product : cart)
        {
            System.out.println(product.getName() + " - " + product.getBrand());
            System.out.println(product.getPrice() + "$");
            subtotal += product.getPrice();
            if (localdate.getDayOfWeek().toString() == Wednesday) {
                if (product.getClass() == Shoes.class) {
                    shoesdiscount = product.getPrice() * 0.25;
                    System.out.println("#discount 25% - " + df.format(shoesdiscount) + "$");
                }
                if (product.getClass() == Shirt.class) {
                    shirtsdiscount = product.getPrice() * 0.10;
                    System.out.println("#discount 25% - " + df.format(shirtsdiscount) + "$");
                }
            }
                    if (cart.size() >= 3) {
                        discount =  product.getPrice() * 0.20;
                        System.out.println("#discount 20% - " + df.format(discount) + "$" );
                    }
                    DISCOUNT += discount;
                }
            WEDNESDAYDICOUNT = shirtsdiscount + shoesdiscount;
            DISCOUNT = DISCOUNT + WEDNESDAYDICOUNT;
            System.out.println("-----------------------------------------------------------------------------------");
            System.out.println("SUBTOTAL:" + df.format(DISCOUNT + subtotal)  + "$");
            System.out.println("DISCOUNT:" + df.format(DISCOUNT)  + "$\n");
            System.out.println("TOTAL:" + df.format(subtotal) + "$");

}
}
