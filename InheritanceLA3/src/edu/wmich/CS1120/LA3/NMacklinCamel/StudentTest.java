package edu.wmich.CS1120.LA3.NMacklinCamel;
/*
 * Neil Macklin-Camel
 * CS1120
 * Lab 3
*/

//This is the StudentTest class
public class StudentTest {
	
	// Method main: Hardcoded input for the 4 students’ courses taken, the credits for each of 
	//		those courses, the students’ names, how many credits each student has taken, 
	//		community service if the student is an undergraduate, or publications if the student is a 
	//	    graduate. Call the GraduationAuditor class.
	public static void main(String[] args) { 
 	 	// TODO Auto-generated method stub 
 	 	GraduationAuditor auditor = new GraduationAuditor(); 
 	 	 
 	 	System.out.println("\nUndergraduate Students:"); 
 	 	System.out.println("=======================\n"); 
 	 	 
 	 	UndergradStudent[] undergrads = new UndergradStudent[2]; 
 	 	 
 	 	// Student #1 
 	 	undergrads[0] = new UndergradStudent("Blanche Graves", 111); 
 	 	System.out.println(undergrads[0].getName());  	 	
 	 	System.out.println("==============");  	 	
 	 	undergrads[0].doCommunityService(20);  	 	
 	 	undergrads[0].doCommunityService(20);  	 	
 	 	undergrads[0].takeCourse("Intro to Java", 26);  	 	
 	 	undergrads[0].takeCourse("Intro to Computing", 8); 
 	 	undergrads[0].printData(); 
 	 	System.out.println(); 
 	 	 
 	 	// Student #2 
 	 	undergrads[1] = new UndergradStudent("Mercedes Patton", 222); 
 	 	System.out.println(undergrads[1].getName());  	 	
 	 	System.out.println("==============");  	 	
 	 	undergrads[1].doCommunityService(15);  	 	
 	 	undergrads[1].takeCourse("Intro to Java", 15);  	 	
 	 	undergrads[1].takeCourse("Intro to Computing", 8); 
 	 	undergrads[1].printData(); 
 	 	 
 	 	System.out.println("\nGraduate Students:"); 
 	 	System.out.println("==================\n");  
 	 	GradStudent[] grads = new GradStudent[2]; 
 	 	 
 	 	// Student #3 
 	 	grads[0] = new GradStudent("Elizabeth Bennett", 111); 
 	 	System.out.println(grads[0].getName());  	 	
 	 	System.out.println("==============");  	 	
 	 	grads[0].publishPaper("The Meaning of Life");  	 	
 	 	grads[0].publishPaper("Living Free");  	 	
 	 	grads[0].takeCourse("Intro to Java", 26); 
 	 	grads[0].takeCourse("Intro to Computing", 8); 
 	 	grads[0].printData();  	 	
 	 	System.out.println(); 
 	 	 
 	 	// Student #4 
 	 	grads[1] = new GradStudent("David Copperfield", 222); 
 	 	System.out.println(grads[1].getName()); 
 	 	System.out.println("=============="); 
 	 	grads[1].publishPaper("The Meaning of Life");  
 	 	grads[1].takeCourse("Intro to Java", 15); 
 	 	grads[1].takeCourse("Intro to Computing", 8); 
 	 	grads[1].printData(); 
 	 	 
 	 	System.out.println("\nAudit results:"); 
 	 	System.out.println("==============\n"); 
 	 	 
 	 	auditor.audit(undergrads); 
 	 	auditor.audit(grads); 
 	}// end of main method
	
}// end of StudentTest class
