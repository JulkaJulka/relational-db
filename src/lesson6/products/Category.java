package lesson6.products;

/**
 * Created by user on 29.03.2018.
 */
public class Category {
    private long categoryId;
    private String categoryName;
    private String description;
    private String picture;

    public Category(long categoryId, String categoryName, String description, String picture) {
        this.categoryId = categoryId;
        this.categoryName = categoryName;
        this.description = description;
        this.picture = picture;
    }
}
