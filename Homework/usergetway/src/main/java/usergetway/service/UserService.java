package usergetway.service;

import lombok.var;
import org.springframework.stereotype.Service;
import usergetway.Interface.IUser;
import usergetway.Interface.IUserService;
import usergetway.db.DBConnection;

@Service
public class UserService implements IUserService {

    private UserService() throws InterruptedException {
        System.out.println("Initialized UserService");
    }

    private static class BillPughSingleton {
        private static UserService INSTANCE;

        static {
            try {
                INSTANCE = new UserService();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static UserService getInstance() {
        System.out.println("Get UserService instance");
        return BillPughSingleton.INSTANCE;
    }

    private IUser iUser;

    @Override
    public void setUser(IUser iUser) {
        this.iUser = iUser;
    }

    @Override
    public void register() {
        var connection = DBConnection.getInstance();
        // thực hiện đăng ký db
        System.out.println("This connection " + connection);
    }
}
