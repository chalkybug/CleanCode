package usergetway.factory;

import usergetway.Enum.RoleEnum;
import usergetway.Interface.IUser;
import usergetway.model.Admin;
import usergetway.model.Member;
import usergetway.model.modelinfo.UserInfo;

public class UserFactory {

    private UserFactory() throws InterruptedException {
        System.out.println("Initialized UserFactory");
    }

    private static class BillPughSingleton {
        private static UserFactory INSTANCE;

        static {
            try {
                INSTANCE = new UserFactory();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static UserFactory getInstance() {
        System.out.println("Get UserFactory instance");
        return UserFactory.BillPughSingleton.INSTANCE;
    }

    public IUser createUser(UserInfo info) {
        if (RoleEnum.ADMIN.name().equals(info.getRole().toUpperCase())) {
            return Admin.builder()
                    .ID(info.getID())
                    .email(info.getEmail())
                    .age(info.getAge())
                    .name(info.getName())
                    .gender(info.getGender())
                    .build();
        } else if (RoleEnum.MEMBER.name().equals(info.getRole().toUpperCase())) {
            return Member.builder()
                    .ID(info.getID())
                    .email(info.getEmail())
                    .age(info.getAge())
                    .name(info.getName())
                    .gender(info.getGender())
                    .build();
        } else {
            throw new IllegalArgumentException("This user type is unsupported");
        }


    }

}
