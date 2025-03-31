package at.fhj.msd;


public class App {
    public static void main(String[] args) {
        
        Customer c1 = new Customer("Umejr Dzinovic", "Algersdorfer Straße 53", "Austria");
        System.out.printf("Name: %s; Address: %s, Country: %s\n", c1.getName(), c1.getAddress(), c1.getCountry());

        OrderItem o1 = new OrderItem("551", 3, 15);
        System.out.printf("Article number: %s, quantity: %d; price: %d --> Total: %d", o1.getArticleNumber(), o1.getQuantity(), o1.getPrice(), o1.getTotal());

    }
}
