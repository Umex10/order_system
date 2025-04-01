package at.fhj.msd;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AppExtended {

    static Scanner input = new Scanner(System.in);

     public static void main(String[] args) {

        Address a1 = new Address("Algersdorfer Straße", "G", "53", "8020", "2", "6");
        
        Customer c1 = new Customer("Umejr Dzinovic", a1, "Bosnia");
        System.out.printf("Name: %s; Address: %s Country: %s\n", c1.getName(), c1.getAddress().toString(), c1.getCountry());

        OrderItem o1 = new OrderItem("551", 3, 15);
        //System.out.printf("Article number: %s, quantity: %d; price: %d --> Total: %d", o1.getArticleNumber(), o1.getQuantity(), o1.getPrice(), o1.getTotal());

        OrderItem o2 = new OrderItem("332", 1, 30);
        OrderItem o3 = new OrderItem("22", 2, 5);
        OrderItem o4 = new OrderItem("1", 7, 10);

        List<OrderItem> order = new ArrayList<>(List.of(o1, o2, o3, o4));
        Order or = new Order(1, order, c1);
        System.out.printf("Total Price of whole order: %d\n", or.getTotalPrice());
        System.out.printf("Customer: %s", or.getCustomer().toString());

        OrderItem o5 = new OrderItem("3", 17, 4);
        OrderItem o6 = new OrderItem("67", 2, 5);
        OrderItem o7 = new OrderItem("4", 7, 10);

        List<OrderItem> order2 = new ArrayList<>(List.of(o5, o6, o7)); //List full of OrderItems
        Order or2 = new Order(2, order2, c1);  //Object of Order.java
        System.out.printf("Total Price of whole order: %d\n", or.getTotalPrice());


        List<Order> everyOrder = new ArrayList<>(List.of(or, or2)); //Put Order into this list. So all orders are in this list. 

        boolean status = true;

        while(status) {
            System.out.print("Before we start, pls enter your order-id: ");
            int orderId = input.nextInt();
            boolean isOrderIdIn = false;
            int orderObject = -1; //This is -1, because I needed to put the counter on to the top of the loop.
            //? Is the orderId inside the everyOrder? If not return to while loop!
            for (Order o: everyOrder) {
                orderObject++; //Index of object to access it later
                if (orderId == o.getOrderId()) {
                    isOrderIdIn = true; //If true, then step out of for loop, because it would instead manipulate the counter!
                    break;
                }
            }

            if (isOrderIdIn == false) {
                System.out.println("This orderId doesn't exist! Try again!");
                System.out.println(); //new line
                continue; //Go to While loop again
            }
            
            System.out.println("What do you want? [a]dd, [p]rint, [q]uit");
            String choice = input.next();
            
            if (choice.equalsIgnoreCase("q") || choice.equalsIgnoreCase("quit")) {
                status = false;
            }

            if(choice.equalsIgnoreCase("a")) {
                System.out.print("article-number> ");
                String articleNumber = input.next();
                System.out.printf("amount> ");
                int amount = input.nextInt();
                System.out.printf("price> ");
                int price = input.nextInt();
                System.out.printf("added %dx %s to your order with orderId: %d\n", amount, articleNumber, orderId);

                everyOrder.get(orderObject).addItems(new OrderItem(articleNumber, amount, price)); //orderObject is the counter from above, so I could access
                //the index here. 
            }

            if (choice.equalsIgnoreCase("p")) {

                everyOrder.get(orderObject).printItems(); //Here also, I can access the object I need and thats thanks to the counter in the for loop

            }
        }



    }
    
}
