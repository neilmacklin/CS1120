/*
Neil Macklin-Camel
Lab 1 
Lillien
CS 1120
*/
package edu.wmich.CS1120.LA1.NMacklinCamel;
import java.io.*;
import java.util.*;
//The TestMChExam class for testing the MultipleChoiceExam class.
public class TestMChExam {
	// Methods: --------------------------------------------------------------------------------------------------------------
	
	// Method Main: Calls both static and non-static methods from the program
	public static void main(String[] args) throws IOException {
		String[] arrayReader = fileReader();
		String[] studentArray = makeStudentArray(arrayReader);
		int[] counterArray = makeCounterArray(arrayReader);
		// Create a new MultipleChoiceExam object to load the amount of questions, the 
		//	 	answer key, the number of students that took the exam, the students’ answers, 
		//		and the incorrect counter array 

		MultipleChoiceExam examGrader = new MultipleChoiceExam(arrayReader[0], arrayReader[1],arrayReader[2],studentArray,counterArray);
		examGrader.theOutput();
	}// end Main
	
	// Method fileReader: Read the “input.txt” and returns an array with each line being however 
	// many lines there are in the “input.txt” file
	public static String[] fileReader() throws IOException {
		File f = new File("input.txt");
        Scanner inFile = new Scanner(f);
        //Read file into ArrayList
        ArrayList<String> listReader = new ArrayList<String>();
        while(inFile.hasNext()) {
        	String record = inFile.nextLine();
        	listReader.add(record);	
        }
        inFile.close();
        //Copy the ArrayList contents into an array
        String arrayReader[] = new String[listReader.size()];
        for(int i = 0;i < listReader.size();i++){
        	  arrayReader[i] = listReader.get(i);
        }
        return arrayReader;
	}// end method fileReader
	
	// Method makeStudentArray: Creates a one-dimensional String array with the students’ 
	// answers 
	public static String[] makeStudentArray(String[] arrayReader) {
		String[] studentArray = new String[arrayReader.length-3];
		int j = 0;
		for(int i = 3; i < arrayReader.length; i++) {
			studentArray[j] = new String(arrayReader[i]);
			j++;
		}
		return studentArray;
	}// end method makeStudentArray

	// Method makeCounterArray: Creates a one-dimensional integer array, with a size of the 
	// amount of students that took the exam, as well as zeros loaded into each spot 
	public static int[] makeCounterArray(String[] arrayReader) {
		int size = Integer.parseInt(arrayReader[2]);
		int[] counterArray = new int[size];
		for (int i =0; i < size; i++) {
			counterArray[i] = 0;
		}
		return counterArray;
	}// end method makeCounterArray
	
}// end class TestMChExam
