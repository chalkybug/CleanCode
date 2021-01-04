package vn.techmaster;

public class CustomerPayAsYouGo extends AbstractCustomer {

    public static final float CALL_COST = 0.12f;
    public static final float SMS_COST = 0.12f;

    @Override
    public float calculateMonthlyFee(CustomerInfo info) {
        setCallCost(CALL_COST * info.callMinutes);
        setSmsCost(SMS_COST * info.smsCount);
        setTotalCost(getCallCost() + getSmsCost());
        return getTotalCost();
    }

}
