package usergetway.service;

import usergetway.Interface.IUserService;
import usergetway.db.DBConnection;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class UserService implements IUserService {

    @Override
    public void register() {
        int concurrent = 5;
        ExecutorService executor = Executors.newFixedThreadPool(concurrent);
        for (int i = 0; i < concurrent; i++) {
            executor.submit(DBConnection::getInstance);
        }
        executor.shutdown();
    }
}
