package at.fhj.msd;

public class OrderItem {

    private String articleNumber;
    private int quantity;
    private int price;

    public OrderItem(String articleNumber, int quantity, int price) {

        this.articleNumber = articleNumber;
        this.quantity = quantity;
        this.price = price;

    }

    public int getTotal() {
        return (this.quantity * this.price);
    }

    public String getArticleNumber() {
        return this.articleNumber;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public int getPrice() {
        return this.price;
    }

}
