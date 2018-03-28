package lesson6.products;

import java.util.Date;

/**
 * Created by user on 29.03.2018.
 */
public class Order {
    private long orderId;
    private Customer customer;
    private Employee employee;
    private Date orderDate;
    private Date requiredDate;
    private Date shippedDate;
    private String shipVia;
    private String freight;
    private String shipName;
    private String shippAddress;
    private String shipCity;
    private String region;
    private int shipPostalCode;
    private String ShipCountry;

    public Order(long orderId, Customer customer, Employee employee, Date orderDate, Date requiredDate,
                 Date shippedDate, String shipVia, String freight, String shipName, String shippAddress,
                 String shipCity, String region, int shipPostalCode, String shipCountry) {
        this.orderId = orderId;
        this.customer = customer;
        this.employee = employee;
        this.orderDate = orderDate;
        this.requiredDate = requiredDate;
        this.shippedDate = shippedDate;
        this.shipVia = shipVia;
        this.freight = freight;
        this.shipName = shipName;
        this.shippAddress = shippAddress;
        this.shipCity = shipCity;
        this.region = region;
        this.shipPostalCode = shipPostalCode;
        this.ShipCountry = shipCountry;
    }

}
