package vn.techmaster;

public class CustomerPayAsYouGo extends AbstractCustomer implements ICustomer {

    @Override
    public float calculateMonthlyFee(CustomerInfo info) {
        setCallCost(0.12f * info.callMinutes);
        setSmsCost(0.12f * info.smsCount);
        setTotalCost(getCallCost() + getSmsCost());
        return getTotalCost();
    }

}
