package lesson2;

import java.util.Date;

public class Order {
    private  long id;
private String productName;
    private int Price;
    private Date dateOrdered;
    private Date dateConfirmed;

    public Order(long id, String productName, int price, Date dateOrdered, Date dateConfirmed) {
        this.id = id;
        this.productName = productName;
        Price = price;
        this.dateOrdered = dateOrdered;
        this.dateConfirmed = dateConfirmed;
    }

    public long getId() {
        return id;
    }

    public String getProductName() {
        return productName;
    }

    public int getPrice() {
        return Price;
    }

    public Date getDateOrdered() {
        return dateOrdered;
    }

    public Date getDateConfirmed() {
        return dateConfirmed;
    }
}
