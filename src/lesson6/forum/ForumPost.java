package lesson6.forum;

/**
 * Created by user on 29.03.2018.
 */
public class ForumPost {
    private long id;
    private ForumSubcategory subcategory;
    private User user;
    private ForumPost forumPost;
    private String title;
    private String content;
    private boolean isPoll;
    private String ip;

    public ForumPost(long id, ForumSubcategory subcategory, User user, ForumPost forumPost, String title,
                     String content, boolean isPoll, String ip) {
        this.id = id;
        this.subcategory = subcategory;
        this.user = user;
        this.forumPost = forumPost;
        this.title = title;
        this.content = content;
        this.isPoll = isPoll;
        this.ip = ip;
    }
}
