package userpost;

import userpost.exception.CommentException;
import userpost.exception.PostException;
import userpost.model.Comment;
import userpost.model.Post;
import userpost.model.User;

import java.util.ArrayList;

public class UserPostApplication {
    public static void main(String[] args) {

        User user1 = User.builder()
                .fullName("A")
                .posts(new ArrayList<>())
                .comments(new ArrayList<>())
                .build();
        Post post1 = user1.writePost("Post 1", "Content post 1");
        Comment comment1 = user1.writeComent("Comment 1", post1);

        User user2 = User.builder()
                .fullName("B")
                .posts(new ArrayList<>())
                .comments(new ArrayList<>())
                .build();
        Post post2 = user2.writePost("Post 1", "Content post 1");
        Comment comment2 = user2.writeComent("Comment 1", post2);

        try {
            user1.deleteComment(comment1);
            user2.deleteComment(comment2);
            user1.deletePost(post2);
        } catch (CommentException e) {
            e.printStackTrace();
        } catch (PostException ex) {
            ex.printStackTrace();
        }
    }
}
