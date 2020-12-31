package vn.techmaster;

public enum CustomerType {
    // trả trước
    PAYASYOUGO(1),
    // trả sau
    UNLIMITED(0);

    private int typeCode;

    CustomerType(int typeCode) {
        this.typeCode = typeCode;
    }
}
