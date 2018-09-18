package edu.wmich.CS1120.LA3.NMacklinCamel;

//This is the UndergradStudent class
public class UndergradStudent extends Student{
	// Inherits from the Student class.
	public int counter = -1;
	public int[] service = {0,0};
	
	// Constructor: Initialize name of student, ID of student and increment public field counter
	public UndergradStudent(String name,int ID) {
		super(name, ID);
		counter++;
	}// end of Constructor
	
	// Methods: --------------------------------------------------------------------------------------------------------------
	
	// Method doCommunityService: Accepts serviceHours (int). Increments the service integer 
	//	 	array public field based on the spot that the counter public field is on
	public void doCommunityService(int serviceHours) {
		service[counter] += serviceHours; 
	}// end of doCommunityService method
	
	// Method printData: Prints the information for the current student which is determined by the 
	// 		public field studentCount, inherited from the Student class
	public void printData() {
		// Overrides the printData method in the Student class
		System.out.printf("Course taken: %s (%d Credits)\nCourse taken: %s (%d Credits)\n\n"
				+ "\nCredits completed %d\nHours of community service: %d\n"
				,getCourseName().get(studentCount),getCourseCredits().get(studentCount)
				,getCourseName().get(studentCount+1),getCourseCredits().get(studentCount+1)
				,(getCourseCredits().get(studentCount) + getCourseCredits().get(studentCount+1)),service[counter]);
	}// end of printData method
	
}// end of UndergradStudent class
