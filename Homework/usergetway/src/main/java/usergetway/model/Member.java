package usergetway.model;

import lombok.Builder;
import lombok.Data;
import usergetway.Enum.GenderEnum;
import usergetway.Interface.IUser;

@Data
@Builder
public class Member implements IUser {
    private String ID;

    private String name;

    private String email;

    private int age;

    private GenderEnum gender;

    @Override
    public String said() {
        return "I'm MEMBER";
    }
}
