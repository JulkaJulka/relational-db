package lesson6.forum;

/**
 * Created by user on 29.03.2018.
 */
public class ForumPollOptionsVote{
    private long id;
    private ForumPollsOption forumPollsOption;
    private User user;
    private String ip;

    public ForumPollOptionsVote(long id, ForumPollsOption forumPollsOption, User user, String ip) {
        this.id = id;
        this.forumPollsOption = forumPollsOption;
        this.user = user;
        this.ip = ip;
    }
}
