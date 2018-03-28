package lesson6.forum;

import java.util.Date;

/**
 * Created by user on 29.03.2018.
 */
public class ForumPollsOption {
    private long id;
    private ForumPost forumPost;
    private String title;
    private Date date;

    public ForumPollsOption(long id, ForumPost forumPost, String title, Date date) {
        this.id = id;
        this.forumPost = forumPost;
        this.title = title;
        this.date = date;
    }
}
