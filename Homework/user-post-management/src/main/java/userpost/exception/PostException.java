package userpost.exception;

import lombok.Data;

@Data
public class PostException extends Exception {

    private String exceptionContent;

    public PostException(String exceptionContent) {
        this.exceptionContent = exceptionContent;
    }

    @Override
    public String toString() {
        return "PostException [exceptionContent=" + exceptionContent + "]";
    }

}
