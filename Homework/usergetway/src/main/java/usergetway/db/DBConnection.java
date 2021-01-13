package usergetway.db;

public class DBConnection {

    private DBConnection() throws InterruptedException {
        System.out.println("Initialized DB connection");
    }

    private static class BillPughSingleton {
        private static DBConnection INSTANCE;

        static {
            try {
                INSTANCE = new DBConnection();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static DBConnection getInstance() {
        System.out.println("Get DB connection instance");
        return BillPughSingleton.INSTANCE;
    }
}

