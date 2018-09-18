package edu.wmich.CS1120.LA1.NMacklinCamel;

import java.io.*;
import java.util.Arrays;
//The MultipleChoiceExam class.
public class MultipleChoiceExam {
	// Fields: questions (int), answerKey (Character array), numOfStudents (int), studentAnswers 
	// (Character array), incorrect (int array) 
	private int questions;
	private Character[] answerKey;
	private int numOfStudents;
	private Character[][] studentAnswers;
	private int[] incorrect; 
	
	// Constructor: Initialize fields questions, answerKey, numOfStudents, studentAnswers, 
	// and incorrect (with values from parameters).
	public MultipleChoiceExam(String numQuestions, String key, String numStudents, String[] studentsAnswers, int[] incorrectArray) {
		setQuestions(numQuestions);
		setAnswerKey(key);
		setNumOfStudents(numStudents);
		setStudentAnswers(studentsAnswers);
		setIncorrect(incorrectArray);
	}// end constructor
	
	//getters and setters
	public int getQuestions() {
		return questions;
	}
	public void setQuestions(String questions) {
		this.questions = Integer.parseInt(questions);
	}
	public Character[] getAnswerKey() {
		return answerKey;
	}
	public void setAnswerKey(String key) {
		Character[] answers = new Character[questions];
		for (int i = 0; i < answers.length; i++) {
			answers[i] = new Character(key.charAt(i));
		}
		this.answerKey = answers;
	}
	public int getNumOfStudents() {
		return numOfStudents;
	}
	public void setNumOfStudents(String numOfStudents) {
		this.numOfStudents = Integer.parseInt(numOfStudents);
	}
	public Character[][] getStudentAnswers() {
		return studentAnswers;
	}
	
	public void setStudentAnswers(String[] answers) {
		Character[][] students = new Character[questions][numOfStudents];
		for (int i = 0; i < questions; i++) {
			for (int j = 0; j < numOfStudents; j++) {
				students[i][j] = new Character(answers[j].charAt(i));
			}
		}
		this.studentAnswers = students;
	}
	
	public int[] getIncorrect() {
		return incorrect;
	}
	public void setIncorrect(int[] incorrect) {
		
		this.incorrect = incorrect; // this is loaded with 'numOfStudents' that many 0's
	}// end of getters and setters
	
	// Methods: --------------------------------------------------------------------------------------------------------------
	
	// Method findLetterGrades: Find the letter grade based on the percentage.
	public char findLetterGrades(double score) {
		 // A percentage score is sent into the method using a for loop in theOutput method
		 char c;
		 if (score >= 90) {
			 c = 'A';
		 } else if (score < 90 && score > 80) {
			 c = 'B';
		 } else if (score < 80 && score > 70) {
			 c = 'C';
		 } else if (score < 70 && score > 60) {
			 c = 'D';
		 } else { 
			 c = 'E';
		 }
		 return c;
		// return ‘c’ as a character to the for loop in theOutput method
	}// end method findLetterGrades

	// Method examGrader: Find whether the students’ answers are correct or incorrect and count 
	// the incorrect answers for each student
	public String examGrader (int i, int j) {
		// Two Integers are sent into this method from theOutput method ‘i’ and ‘j’ which are 
		// 		the row and column number to locate the exact student answer with the 
		//		corresponding answer from the answer key (The ‘i’ is from the outer for loop in 
		// 		theOutput method and the ‘j’ is from the inner for loop from theOutput 
		//	 	method)
		String returned;
		if (studentAnswers[i][j].equals(answerKey[i])) {
			returned = String.format("%2d)%2s\t\t ", i+1, studentAnswers[i][j]);
		} else {
			returned = String.format("%2d)%2s (%s)\t ", i+1,studentAnswers[i][j], answerKey[i]);
			incorrect[j]++;
		}
		return returned;
		//return ‘returned’ as a String to the inner for loop in theOutput method
	}// end method examGrader
	
	// Method theOutput: Display the answer key, the students’ answers, students letter grades 
	// and percentages
	public void theOutput() {
		   // Display the header for the answer key
		   System.out.printf("%s\n", "Answer Key:");
		   // Display the answer key with their corresponding numbers
		   for (int i = 0; i < answerKey.length; i++) {
		    	System.out.printf("%2d)%2s\n", i+1 ,answerKey[i]);
		   }
		   // Display the header for the students' answers
		   System.out.println("\nStudent Answers:");
		   // Display the which student number are which (i.e. Student 2:)
		   for (int i = 0; i < numOfStudents; i++) {
			   System.out.printf("Student %d\t ", i+1);
		   }
		   System.out.println();
		   String printNicely;
		   // Display the students’ answers with their corresponding numbers and the incorrect 
		   //		answers if needed using the examGrader method

		   for (int i = 0; i < questions; i++) {
			   for (int j = 0; j < numOfStudents; j++) {
				   printNicely = examGrader(i, j);
				   System.out.printf(printNicely);
			   }
			   System.out.println();
		   }
		   
		   double length = answerKey.length;
		   double score;
		   char letterGrade;
		   // Display the student’s number and calculate their percentage score and send that 
		   //		score to the findLetterGrade method, to then display the student’s percentage 
		   // 		score and letter grade

		   for (int i = 0; i < numOfStudents; i++) {
			   score = (100*(questions-incorrect[i])/length);
			   letterGrade = findLetterGrades(score);
			   System.out.printf("Student %d: %.0f%% %s\n", i+1, score, letterGrade);
		   }	   
	}// end method theOutput
	
}// end class MultipleChoiceExam
