package at.fhj.msd;
import java.util.List;

public class Order {

    private int orderId;
    private List<OrderItem> listOrderItems;
    private Customer customer;


    public Order(int orderId, List<OrderItem> listOrderItems, Customer customer) {
        this.orderId = orderId;
        this.listOrderItems = listOrderItems;
        this.customer = customer;
    }

    public int getOrderId() {
        return this.orderId;
    }

    public int getTotalPrice() {
        int sum = 0;
        for (OrderItem item: this.listOrderItems) {
            sum += item.getTotal();
        }

        return sum;
    }

    public Customer getCustomer() {
        return this.customer;
    }

    public List<OrderItem> addItems(OrderItem o) {
        this.listOrderItems.add(o);
        return this.listOrderItems;
    }

    public void printItems() {
        System.out.printf("%-6s | %-6s | %-6s | %-6s%n", "ArtNr", "amount", "price", "total"); //"-" left-aligned | 6 Characters width
        System.out.println("--------------------------------");
    
        for (OrderItem o : this.listOrderItems) {
            System.out.printf("%-6s | %-6d | %-6d | %-6d%n", //"-" left-aligned | 6 Characters width
                o.getArticleNumber(), o.getQuantity(), o.getPrice(), o.getTotal());
        }
    
        System.out.println("--------------------------------");
        System.out.printf("total: %23d%n", this.getTotalPrice()); //Place total right-aligned
    }
    

   

}
