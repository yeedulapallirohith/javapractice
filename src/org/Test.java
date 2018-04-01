package org;

public class Test {

	public static void main(String[] args) {
		Student s1 = new Student(1, "Ram");
		Student s2 = new Student(2, "Krish");
		
		s1.updateCounter();
		s2.updateCounter();
		
		s1.printCounters();
		s2.printCounters();
		
		
	}

}
