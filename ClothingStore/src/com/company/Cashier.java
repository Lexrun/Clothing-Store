package com.company;
import com.company.Product;
import com.company.Main;
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
    String Tuesday = "WEDNESDAY";
    DecimalFormat df = new DecimalFormat("#.00");
    public Cashier(List<Product> cart,LocalDate localdate)
    {
        for(Product n : cart)
        {
            System.out.println(n.getName() + " - " + n.getBrand());
            System.out.println(n.getPrice() + "$");
            subtotal += n.getPrice();
            if (localdate.getDayOfWeek().toString() == Tuesday) {
                if (n.getClass() == Shoes.class) {
                    shoesdiscount = n.getPrice() * 0.25;
                    System.out.println("#discount 25% - " + df.format(shoesdiscount) + "$");
                }
                if (n.getClass() == Shirt.class) {
                    shirtsdiscount = n.getPrice() * 0.10;
                    System.out.println("#discount 25% - " + df.format(shirtsdiscount) + "$");
                }
            }
                    if (cart.size() >= 3) {
                        discount =  n.getPrice() * 0.20;
                        System.out.println("#discount 20% - " + df.format(discount) + "$" );
                    }
                    DISCOUNT += discount;
                }
            WEDNESDAYDICOUNT = shirtsdiscount + shoesdiscount;
            DISCOUNT = DISCOUNT + WEDNESDAYDICOUNT;
            System.out.println("-----------------------------------------------------------------------------------");
            System.out.println("SUBTOTAL:" + df.format(subtotal) + "$");
            System.out.println("DISCOUNT:" + df.format(DISCOUNT)  + "$\n");
            System.out.println("TOTAL:" + df.format(DISCOUNT + subtotal)  + "$");

}
}