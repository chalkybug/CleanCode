package vn.techmaster;

public class CustomerInfo {
    public int callMinutes;
    public int smsCount;
    public static final int DEFAULT_VALUE = 0;

    public CustomerInfo(Integer callMinutes, Integer smsCount) {
        this.callMinutes = callMinutes == null ? DEFAULT_VALUE : callMinutes;
        this.smsCount = smsCount == null ? DEFAULT_VALUE : smsCount;
    }
}
