package net.luvina.payroll.model;

import net.luvina.payroll.common.Common;

public class Employee {
	private String name;
	private String dob;
	private String role;
	private String startdate;
	private int salary;

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