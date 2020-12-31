package vn.techmaster;

public abstract class AbstractCustomer {
    private float callCost;
    private float smsCost;
    private float totalCost;

    protected float getCallCost() {
        return this.callCost;
    }

    protected void setCallCost(float callCost) {
        this.callCost = callCost;
    }

    protected float getSmsCost() {
        return this.smsCost;
    }

    protected void setSmsCost(float smsCost) {
        this.smsCost = smsCost;
    }

    protected float getTotalCost() {
        return this.totalCost;
    }

    protected void setTotalCost(float totalCost) {
        this.totalCost = totalCost;
    }
}
