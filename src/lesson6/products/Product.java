package lesson6.products;

/**
 * Created by user on 29.03.2018.
 */
public class Product {
    private long id;
    private String productName;
    private Supplier supplier;
    private Category category;
    private double unitePrice;
    private int unitsInStock;
    private int unitsOnOrder;
    private int reorderLevel;
    private double discountinued;

    public Product(long id, String productName, Supplier supplier, Category category, double unitePrice,
                   int unitsInStock, int unitsOnOrder, int reorderLevel, double discountinued) {
        this.id = id;
        this.productName = productName;
        this.supplier = supplier;
        this.category = category;
        this.unitePrice = unitePrice;
        this.unitsInStock = unitsInStock;
        this.unitsOnOrder = unitsOnOrder;
        this.reorderLevel = reorderLevel;
        this.discountinued = discountinued;
    }
}
