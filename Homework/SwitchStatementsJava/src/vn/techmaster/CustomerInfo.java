package vn.techmaster;

public class CustomerInfo {
    public int callMinutes;
    public int smsCount;

    public CustomerInfo(Integer callMinutes, Integer smsCount) {
        this.callMinutes = callMinutes == null ? 0 : callMinutes;
        this.smsCount = smsCount == null ? 0 : smsCount;
    }
}
