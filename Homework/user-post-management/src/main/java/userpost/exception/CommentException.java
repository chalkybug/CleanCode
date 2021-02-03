package userpost.exception;

import lombok.Data;

@Data
public class CommentException extends Exception {

    private String exceptionContent;

    public CommentException(String exceptionContent) {
        this.exceptionContent = exceptionContent;
    }

    @Override
    public String toString() {
        return "CommentException [exceptionContent=" + exceptionContent + "]";
    }

}
