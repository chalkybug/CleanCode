package userpost.model;

import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;
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
        System.out.println("Comment added");
    }

    public void deleteComment(Comment comment) {
        comments.remove(comment);
        System.out.println("Comment deleted");
    }


}
