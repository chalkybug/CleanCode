package usergetway;

import usergetway.Interface.IUser;
import usergetway.factory.UserFactory;
import usergetway.model.modelinfo.UserInfo;

/**
 * Solution 2 - Use @Builder of Lombok
 */
public class UserApplication {

    public static void main(String[] args) {
        UserInfo info = new UserInfo();
        info.setRole("admin");
        UserFactory userFactory = new UserFactory();
        IUser iUser = userFactory.createUser(info);
        iUser.said();

    }

}
