package lesson6.forum;

import lesson6.products.Category;

import java.util.Date;

/**
 * Created by user on 29.03.2018.
 */
public class ForumSubcategory extends Category {
    private Category category;

    public ForumSubcategory(long categoryId, String categoryName, String description, String picture, Category category) {
        super(categoryId, categoryName, description, picture);
        this.category = category;
    }
}
