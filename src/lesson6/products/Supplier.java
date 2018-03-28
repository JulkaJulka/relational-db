package lesson6.products;

/**
 * Created by user on 29.03.2018.
 */
public class Supplier {
    private long supplierId;
    private String companyName;
    private String contactName;
    private String contactTitle;
    private String address;
    private String city;
    private String region;
    private int postalCode;
    private String country;
    private String phone;
    private String fax;
    private String homePage;

    public Supplier(long supplierId, String companyName, String contactName, String contactTitle, String address,
                    String city, String region, int postalCode, String country, String phone, String fax,
                    String homePage) {
        this.supplierId = supplierId;
        this.companyName = companyName;
        this.contactName = contactName;
        this.contactTitle = contactTitle;
        this.address = address;
        this.city = city;
        this.region = region;
        this.postalCode = postalCode;
        this.country = country;
        this.phone = phone;
        this.fax = fax;
        this.homePage = homePage;
    }
}
