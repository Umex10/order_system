package at.fhj.msd;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        Address a1 = new Address("Algersdorfer Straße", "G", "53", "8020", "2", "6");
        
        Customer c1 = new Customer("Umejr Dzinovic", a1, "Bosnia");
        System.out.printf("Name: %s; Address: %s, Country: %s\n", c1.getName(), c1.getAddress(), c1.getCountry());

        OrderItem o1 = new OrderItem("551", 3, 15);
        //System.out.printf("Article number: %s, quantity: %d; price: %d --> Total: %d", o1.getArticleNumber(), o1.getQuantity(), o1.getPrice(), o1.getTotal());

        OrderItem o2 = new OrderItem("332", 1, 30);
        OrderItem o3 = new OrderItem("22", 2, 5);
        OrderItem o4 = new OrderItem("1", 7, 10);

        

        List<OrderItem> order = new ArrayList<>(List.of(o1, o2, o3, o4));
        Order or = new Order(1, order, c1);
        System.out.printf("Total Price of whole order: %d\n", or.getTotalPrice());
        System.out.printf("Customer: %s", c1);

    }
}
