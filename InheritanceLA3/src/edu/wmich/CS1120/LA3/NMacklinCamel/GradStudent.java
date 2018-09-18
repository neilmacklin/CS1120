package edu.wmich.CS1120.LA3.NMacklinCamel;

//This is the GradStudent class
public class GradStudent extends Student{
	// Inherits from the Student class.
	public int counter = 0;
	public int[] published = {0,0};
	private String paperPublish;
	private String paperPublishTwo;
	
	// Constructor: Initialize paperPublishTwo, student’s name, student’s ID, increment public field 
	// 		counter
	public GradStudent(String name,int ID) {
		super(name, ID);
		this.paperPublishTwo = "";
		counter++;
	}// end of Constructor
	
	// getters and setters
	public String getPaperPublishTwo() {
		return paperPublishTwo;
	}
	public void setPaperPublishTwo(String paperPublishTwo) {
		this.paperPublishTwo = paperPublishTwo;
	}

	public String getPaperPublish() {
		return paperPublish;
	}
	public void setPaperPublish(String paperPublish) {
		this.paperPublish = paperPublish;
	}
	// end of getters and setters
	
	// Methods: --------------------------------------------------------------------------------------------------------------
	
	// Method publishPaper: Initialize paperPublish, paperPublishTwo - If there is a second paper
	public void publishPaper(String paper) {
		if (this.published[counter] == 0) {
			setPaperPublish(paper);
			this.published[counter]++;
		} else {
			setPaperPublishTwo(paper);
			this.published[counter]++;
		}
	}// end of publishPaper method
	
	// Method printData: Prints the information for the current student which is determined by the 
	// 		public field studentCount, inherited from the Student class
	public void printData() {
		// Overrides the printData method in the Student class
		// Print one or two publication names based on if paperPublishTwo equals “” 
		if (this.paperPublishTwo == "") {
			System.out.printf("Publication #1: %s\nCourse taken: %s (%d Credits)\nCourse taken: %s (%d Credits)\n\n"
					+ "\nCredits completed %d\nNumber of publications: %d\n"
					,paperPublish,getCourseName().get(studentCount),getCourseCredits().get(studentCount)
					,getCourseName().get(studentCount+1),getCourseCredits().get(studentCount+1)
					,(getCourseCredits().get(studentCount) + getCourseCredits().get(studentCount+1)),published[counter]);
		} else {
			System.out.printf("Publication #1: %s\nPublication #2: %s\nCourse taken: %s (%d Credits)\nCourse taken: %s (%d Credits)\n\n"
					+ "\nCredits completed %d\nNumber of publications: %d\n"
					,paperPublish,paperPublishTwo,getCourseName().get(studentCount),getCourseCredits().get(studentCount)
					,getCourseName().get(studentCount+1),getCourseCredits().get(studentCount+1)
					,(getCourseCredits().get(studentCount) + getCourseCredits().get(studentCount+1)),published[counter]);
		}
	}// end of printData method

}// end of GradStudent class
