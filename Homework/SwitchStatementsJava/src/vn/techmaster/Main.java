package vn.techmaster;

public class Main {

    public static void main(String[] args) throws Exception {

        CustomerFactory customerFactory = new CustomerFactory();
        AbstractCustomer customerPayAsYouGo = customerFactory.createCustomer(CustomerType.PAYASYOUGO);
        AbstractCustomer customerUnlimited = customerFactory.createCustomer(CustomerType.UNLIMITED);

        var customerInfoPayAsYouGo = new CustomerInfo(200, 500);
        var feeTotalPayAsYouGo = customerPayAsYouGo.calculateMonthlyFee(customerInfoPayAsYouGo);
        System.out.println(feeTotalPayAsYouGo);

        var customerInfoUnlimited = new CustomerInfo(100, 500);
        var feeTotalUnlimited = customerUnlimited.calculateMonthlyFee(customerInfoUnlimited);

        System.out.println(feeTotalUnlimited);

    }
}
