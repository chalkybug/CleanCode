package usergetway;

import usergetway.Interface.IUser;
import usergetway.factory.UserFactory;
import usergetway.model.modelinfo.UserInfo;
import usergetway.service.UserService;


public class UserApplication {


    public static void main(String[] args) {
        UserInfo info = UserInfo.builder()
                .ID("1")
                .role("member")
                .age(10)
                .build();
        UserFactory userFactory = UserFactory.getInstance();
        IUser iUser = userFactory.createUser(info);
        System.out.println(iUser.said());
        System.out.println(iUser.toString());

        UserService userService = UserService.getInstance();
        userService.setUser(iUser);
        userService.register();

    }


}
