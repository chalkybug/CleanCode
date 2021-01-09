package usergetway.model;

import lombok.Builder;
import lombok.Data;
import usergetway.Enum.GenderEnum;
import usergetway.Interface.IUser;

@Data
@Builder
public class Admin implements IUser {

    private String name;

    private String role;

    private String address;

    private GenderEnum gender;


    @Override
    public void said() {
        System.out.println("ADMIN");
    }
}
