package test;

import java.time.LocalDate;
import java.util.Calendar;

public class Person {
	
	public Person(String name, LocalDate dob, Gender gender, String emailAddress) {
		
		this.name = name;
		this.dob = dob;
		this.gender = gender;
		this.emailAddress = emailAddress;
		this.age = Calendar.getInstance().get(Calendar.YEAR) - dob.getYear();
		
	}

	public enum Gender {
		MALE, FEMALE
	}
	
	String name;
	LocalDate dob;
	
	Gender gender;
	
	String emailAddress;
	final int age;
	
	public int getAge(){
		return age;
	}
	public LocalDate getDOB(){
		return this.dob;
	}
	public String getEmailAddress(){
		return this.emailAddress;
	}
	
	public void printPerson () {
		System.out.println("Person name is "+ this.name + ", age is "+ this.getAge());
	}
}
