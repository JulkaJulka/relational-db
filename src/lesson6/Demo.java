package lesson6;

/**
 * Created by user on 27.03.2018.
 */
public class Demo {
    public static void main(String[] args) {
        Author author = new Author(105l, "Test");
        Article article = new Article(1l, "Test header", "Test text", author);
    }
}
