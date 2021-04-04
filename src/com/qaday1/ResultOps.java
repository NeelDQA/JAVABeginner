package com.qaday1;

public class ResultOps {

	public static int Results;
		static int phys;
		static int chem;
		static int bio;
		
		static int total;
		static int percentage;
		static int phys_percentage;
		static int chem_percentage;
		static int bio_percentage;
		
		public static void displayResults() {
			total = phys + chem + bio;
			
			String result = "PHYSICS:" + phys + "\n"
							+"CHEMISTRY:" + chem + "\n"
							+"BIOLOGY:" + bio + "\n"
							+"TOTAL:"+total + "/450";
			System.out.println(result);
			 
		}
	
		public static void displayTotalAsPercentage() {
			total = phys + chem + bio;
			percentage = total*100/450;
			phys_percentage = phys*100/150;
			chem_percentage = chem*100/150;
			bio_percentage = bio*100/150;
			
			
			
			
			if (phys_percentage<60 & chem_percentage<60 & bio_percentage<60 ) {
				System.out.println("PERCENTAGE:" + (percentage) + "%" + "\n"
						+ "YOU HAVE FAILED EVERYTHING LOL");
			}
			else if (phys_percentage<60 & chem_percentage<60 & bio_percentage>=60) {
				System.out.println("PERCENTAGE:" + (percentage) + "%" + "\n"
						+ "YOU HAVE FAILED PHYSICS AND CHEMISTRY LOL");
			}
			else  {
			System.out.println("PERCENTAGE:" + (percentage) + "%");
			}
			
	
		}
		
	
	}
	
