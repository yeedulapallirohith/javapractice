package org;

public class Student {

	static int counter = 0;
	private int ctr = 0;
	private int number;
	private String name;
	
	public Student(int n, String name) {
		this.number = n;
		this.name = name;
			
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void updateCounter() {
		counter++;
		ctr++;
	}
	
	public void printCounters() {
		System.out.println(counter + "  " + ctr);
	}
	
}
