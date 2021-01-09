package usergetway.factory;

import usergetway.Enum.RoleEnum;
import usergetway.Interface.IUser;
import usergetway.model.Admin;
import usergetway.model.User;
import usergetway.model.modelinfo.UserInfo;

public class UserFactory {

    public IUser createUser(UserInfo info) {
        if (RoleEnum.ADMIN.name().equals(info.getRole().toUpperCase())) {
            return Admin.builder().build();
        } else {
            return User.builder().build();
        }

    }

}
