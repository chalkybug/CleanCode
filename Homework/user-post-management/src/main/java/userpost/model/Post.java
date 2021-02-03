package userpost.model;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class Post {

    private long id;

    private String title;

    private String content;

    private User user;

    private List<Comment> comments;

    void addComment(Comment comment) {
        comments.add(comment);
    }

    public void deleteComment(Comment comment) {
        comments.remove(comment);
    }


}
