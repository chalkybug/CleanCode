package userpost.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Comment {
    private long id;
    private String title;

    private Post post;
    private User user;


}
