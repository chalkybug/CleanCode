## db
- chứa class DBConnection kết nối db
## Enum
- chứa `genderEnum` gồm  **MALE, FEMALE** và `RoleEnum` gồm **ADMIN,MEMBER**
## factory
- chứa `UserFactory` theo Singleton(BillPugh) và sử dụng Factory design partten
## Interface
- chứa `IUserService` và `IUser`
## model
- chứa 2 class `Admin` và `Member` sử dụng **@Buider @Data lombok** và implements IUser
## model/modelinfo
- Chứa `UserInfo` định nghĩa các thuộc tính input của user sử dụng **@Buider @Data lombok**

## service
- Chứa `UserService` theo Singleton(BillPugh)

## Hàm main
- Set UserInfo sử dụng **@Buider**
```
        UserInfo info = UserInfo.builder()
                .ID("1")
                .role("member")
                .age(10)
                .build();
```
- Get Instance của UserFactory và tạo User sử dụng **@Factory**
```
 UserFactory userFactory = UserFactory.getInstance();
        IUser iUser = userFactory.createUser(info);
        System.out.println(iUser.said());
        System.out.println(iUser.toString());
```

- Get Instance của UserService và thực hiện `register()` sử dụng **@Singleton**
```
        UserService userService = UserService.getInstance();
        userService.setUser(iUser);
        userService.register();
```
