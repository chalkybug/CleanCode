package userpost.model;

import lombok.Builder;
import lombok.Data;
import userpost.exception.CommentException;
import userpost.exception.PostException;

import java.util.ArrayList;
import java.util.List;

@Data
@Builder
public class User {

    private long id;

    private String fullName;

    private List<Post> posts;

    private List<Comment> comments;

    public Post writePost(String title, String content) {
        Post post = Post.builder()
                .title(title)
                .content(content)
                .comments(new ArrayList<>())
                .build();
        posts.add(post);
        return post;
    }

    public Comment writeComment(String title, Post post) {
        Comment comment = Comment.builder().title(title).post(post).build();
        post.addComment(comment);
        comments.add(comment);
        return comment;
    }

    public void deletePost(Post post) throws PostException {
        if (posts.contains(post)) {
            posts.remove(post);
        } else {
            throw new PostException("Can't delete others' post");
        }
    }

    public void deleteComment(Comment comment) throws CommentException {
        if (comments.contains(comment)) {
            comment.getPost().deleteComment(comment);
            comments.remove(comment);
        } else {
            throw new CommentException("Can't delete others' comment");
        }
    }


}
