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

   

}
