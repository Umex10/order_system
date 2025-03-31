package at.fhj.msd;
import java.util.List;

public class Order {

    private int orderId;
    private List<OrderItem> listOrderItems;

    public Order(int orderId, List<OrderItem> listOrderItems) {
        this.orderId = orderId;
        this.listOrderItems = listOrderItems;
    }

    public int getTotalPrice() {
        int sum = 0;
        for (OrderItem item: this.listOrderItems) {
            sum += item.getTotal();
        }

        return sum;
    }

    



}
