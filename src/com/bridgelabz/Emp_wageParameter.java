package com.bridgelabz;

public class Emp_wageParameter {
	public String company;
	public int wAGEPerHour;
	public int workingDaysPerMonth;
	public int totalWorkingHours;

	public Emp_wageParameter(String company, int wAGEPerHour, int workingDaysPerMonth, int totalWorkingHours) {
		this.company = company;
		this.wAGEPerHour = wAGEPerHour;
		this.workingDaysPerMonth = workingDaysPerMonth;
		this.totalWorkingHours = totalWorkingHours;
	}
}