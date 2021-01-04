package vn.techmaster;

public class CustomerUnlimited extends AbstractCustomer {
    public static final float MONTHLY_FEE = 54.90f;

    @Override
    public float calculateMonthlyFee(CustomerInfo info) {
        return MONTHLY_FEE;
    }

}
