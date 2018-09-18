package edu.wmich.CS1120.LA3.NMacklinCamel;

import java.util.*;
//This is the Student class
public class Student {
	private int ID;
	private ArrayList<String> courseName = new ArrayList<String>();
	private ArrayList<Integer> courseCredits = new ArrayList<Integer>();
	private ArrayList<String> name = new ArrayList<String>();
	
	public int studentCount = -1;
	
	// Constructor: Initialize fields ID and name. Increment public field studentCount. 
	public Student(String name, int ID) {
		setName(name);
		setID(ID);
		studentCount++;
	}// end of Constructor 
	
	//getters and setters
	public ArrayList<String> getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName.add(courseName);
	}

	public ArrayList<Integer> getCourseCredits() {
		return courseCredits;
	}

	public void setCourseCredits(int courseCredits) {
		this.courseCredits.add(courseCredits);
	}

	public ArrayList<String> getName() {
		return name;
	}

	public void setName(String name) {
		this.name.add(name);
	}
	
	public int getID() {
		return ID;
	}

	public void setID(int ID) {
		this.ID = ID;
	}
	// end of getters and setters
	
	// Methods: --------------------------------------------------------------------------------------------------------------
	
	// Method takeCourse: Initialize fields courseName and courseCredits
	public void takeCourse(String course, int creditsForCourse) { 
		setCourseName(course);
		setCourseCredits(creditsForCourse);
	}// end of takeCourse method
	
	// Method printData: Display a statement if no data was entered
	public void printData() {
		System.out.println("No data was entered.");
	}// end of printData method
	
}// end of Student class
