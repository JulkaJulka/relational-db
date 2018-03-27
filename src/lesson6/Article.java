package lesson6;

/**
 * Created by user on 26.03.2018.
 */
public class Article {
    private long id;
    private String header;
    private String text;


    public Article(long id, String header, String text, Author author) {
        this.id = id;
        this.header = header;
        this.text = text;
    }

}
