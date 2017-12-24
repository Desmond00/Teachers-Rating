package com.sayak.model;

public class Student {
	private String roll_number;
	private String name;
	private String discipline;
	private int passing_year;
	private int current_year;
	public Student() {
		super();
	}
	public Student(String roll_number, String name, String discipline, int passing_year, int current_year) {
		super();
		this.roll_number = roll_number;
		this.name = name;
		this.discipline = discipline;
		this.passing_year = passing_year;
		this.current_year = current_year;
	}
	public String getRoll_number() {
		return roll_number;
	}
	public void setRoll_number(String roll_number) {
		this.roll_number = roll_number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDiscipline() {
		return discipline;
	}
	public void setDiscipline(String discipline) {
		this.discipline = discipline;
	}
	public int getPassing_year() {
		return passing_year;
	}
	public void setPassing_year(int passing_year) {
		this.passing_year = passing_year;
	}
	public int getCurrent_year() {
		return current_year;
	}
	public void setCurrent_year(int current_year) {
		this.current_year = current_year;
	}
	
}
