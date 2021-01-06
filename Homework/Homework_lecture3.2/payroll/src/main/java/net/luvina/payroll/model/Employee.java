package net.luvina.payroll.model;

import com.poiji.annotation.ExcelCellName;
import net.luvina.payroll.common.Common;

public class Employee {

    @ExcelCellName("name")
    private String name;

    @ExcelCellName("dob")
    private String dob;

    @ExcelCellName("role")
    private String role;

    @ExcelCellName("startdate")
    private String startdate;

    @ExcelCellName("salary")
    private int salary;

    private boolean isOvertime;
    private int hourOvertime;

    public int getHourOvertime() {
        return hourOvertime;
    }

    public void setHourOvertime(int hourOvertime) {
        this.hourOvertime = hourOvertime;
    }

    public int getSalaryBonusSales() {
        return salaryBonusSales;
    }

    public void setSalaryBonusSales(int salaryBonusSales) {
        this.salaryBonusSales = salaryBonusSales;
    }

    private boolean isBonusSales;
    private int salaryBonusSales;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getRole() {
        return role;
    }

    public boolean isOvertime() {
        return isOvertime;
    }

    public void setOvertime(boolean overtime) {
        isOvertime = overtime;
    }

    public boolean isBonusSales() {
        return isBonusSales;
    }

    public void setBonusSales(boolean bonusSales) {
        isBonusSales = bonusSales;
    }

    /*
     * From DOB, calculate age of employee
     */
    public float getAge() {
        return Common.calculatorDate(this.dob);
    }

    /*
     * calculate years of Exp
     */
    public String getEpx() {
        float year_of_exp = Common.calculateYearsAndMonthOfExperience(this.startdate);
        return Common.convertToTextExp(year_of_exp);
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getStartdate() {
        return startdate;
    }

    public void setStartdate(String startdate) {
        this.startdate = startdate;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee [dob=" + dob + ", name=" + name + ", age in years = " + String.valueOf(this.getAge())
                + ", exp= " + this.getEpx() + "]";
    }
}