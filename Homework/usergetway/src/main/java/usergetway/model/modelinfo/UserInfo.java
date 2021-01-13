package usergetway.model.modelinfo;

import lombok.Builder;
import lombok.Data;
import usergetway.Enum.GenderEnum;

@Data
@Builder
public class UserInfo {

    private String ID;

    private String name;

    private String email;

    private int age;

    private String role;

    private GenderEnum gender;


}
