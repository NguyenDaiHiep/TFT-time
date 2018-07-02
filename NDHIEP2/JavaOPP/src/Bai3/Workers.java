package Bai3;

import java.util.ArrayList;

public class Workers extends Human implements Comparable<Workers> {
	private int weekSalary;
	private int WorkHourPerDay;

	public Workers(String firstName, String lastname, int weekSalary, int workHourPerDay) {
		super(firstName, lastname);
		this.weekSalary = weekSalary;
		WorkHourPerDay = workHourPerDay;
	}

	public int getWeekSalary() {
		return weekSalary;
	}

	public int getWorkHourPerDay() {
		return WorkHourPerDay;
	}

	public int MoneyPerHours() {
		return weekSalary / (WorkHourPerDay * 7);
	}

	public int compareTo(Workers works) {
		if (MoneyPerHours() == works.MoneyPerHours())
			return 0;
		else if (MoneyPerHours() > works.MoneyPerHours())
			return 1;
		else
			return -1;
	}

	@Override
	public String toString() {
		return "Workers: " + getFirstName() + " " + getLastname() + " " + weekSalary + " " + WorkHourPerDay + "\n";
	}
	

}
