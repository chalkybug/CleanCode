package net.luvina.payroll.Enum;

public enum RankSalaryEnum {
    ENGINEER(0.1), DIRECTOR(0.2), SALES(0.05), WORKER(0.2), MANAGER(0.2);
    private double value;

    public double getValue() {
        return value;
    }

    RankSalaryEnum(double value) {
        this.value = value;
    }
}
