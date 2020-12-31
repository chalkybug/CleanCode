package vn.techmaster;

public class CustomerFactory {
    public ICustomer createCustomer(CustomerType customerType) {
        if (customerType.equals(CustomerType.UNLIMITED)) {
            return new CustomerUnlimited();
        } else {
            return new CustomerPayAsYouGo();
        }

    }
}
