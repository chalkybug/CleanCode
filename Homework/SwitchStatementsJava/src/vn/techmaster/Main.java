package vn.techmaster;

public class Main {

    public static void main(String[] args) throws Exception {

        CustomerFactory customerFactory = new CustomerFactory();
        CustomerService customerService = new CustomerService();
        ICustomer customerPayAsYouGo = customerFactory.createCustomer(CustomerType.PAYASYOUGO);
        ICustomer customerUnlimited = customerFactory.createCustomer(CustomerType.UNLIMITED);

        customerService.setCustomer(customerPayAsYouGo);
        var customerInfoPayAsYouGo = new CustomerInfo(200, 500);
        var feeTotalPayAsYouGo = customerService.calculateMonthlyFee(customerInfoPayAsYouGo);
        System.out.println(feeTotalPayAsYouGo);

        customerService.setCustomer(customerUnlimited);
        var customerInfoUnlimited = new CustomerInfo(100, 500);
        var feeTotalUnlimited = customerService.calculateMonthlyFee(customerInfoUnlimited);

        System.out.println(feeTotalUnlimited);

    }
}
