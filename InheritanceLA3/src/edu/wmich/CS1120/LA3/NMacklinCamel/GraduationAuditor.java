package edu.wmich.CS1120.LA3.NMacklinCamel;
// This is the GraduationAuditor class
public class GraduationAuditor {
	// Methods: --------------------------------------------------------------------------------------------------------------
	
	// Method audit: Accepts UndergradStudent array as a parameter, displays whether the 
	//	 	undergraduate students can graduate or not 
	public void audit(UndergradStudent[] education) {
		for(int i = 0; i < 2; i++) {
			// Undergraduate student will graduate if their community service hours are equal to 
			//		 	or greater than 20 AND their course credits completed must be equal to or 
			//			greater than 30
			if (((education[i].getCourseCredits().get(0) + education[i].getCourseCredits().get(1)) >= 30) && education[i].service[0] >= 20) {
				System.out.printf("%s can graduate\n",education[i].getName().get(0));
			} else {
			    System.out.printf("%s cannot graduate\n",education[i].getName().get(0));
			}
		}
	}// end of audit method
	
	// Method audit: Accepts GradStudent array as a parameter, displays whether the 
	// 		graduate students can graduate or not 
	public void audit(GradStudent[] education) {
		for (int i = 0; i < 2; i++) {
			// Graduate student will graduate if their amount of publications is equal to 
			//		 	or greater than 2 AND their course credits completed must be equal to or 
			//			greater than 30
			if (((education[i].getCourseCredits().get(0) + education[i].getCourseCredits().get(1)) >= 30) && education[i].published[1] >= 2) {
				System.out.printf("%s can graduate\n",education[i].getName().get(0));
			} else {
				System.out.printf("%s cannot graduate\n",education[i].getName().get(0));
			}
		}
	}// end of audit method
}// end of GraduationAuditor class
