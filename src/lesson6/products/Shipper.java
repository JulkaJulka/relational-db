package lesson6.products;

/**
 * Created by user on 29.03.2018.
 */
public class Shipper {
    private long shipperId;
    private String companyName;
    private String phone;

    public Shipper(long shipperId, String companyName, String phone) {
        this.shipperId = shipperId;
        this.companyName = companyName;
        this.phone = phone;
    }
}
