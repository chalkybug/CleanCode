package vn.techmaster;

public class CustomerUnlimited extends AbstractCustomer implements ICustomer {
    @Override
    public float calculateMonthlyFee(CustomerInfo info) {
        return 54.90f;
    }

}
