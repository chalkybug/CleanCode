package vn.techmaster;

public class CustomerService {
    private ICustomer customer;

    public void setCustomer(ICustomer customer) {
        this.customer = customer;
    }

    public float calculateMonthlyFee(CustomerInfo info) {
        return customer.calculateMonthlyFee(info);
    }
}
