package credit;

public class CreditScore {

	public String annualCreditScore(Credit c) {// Credit class returns the credit score based on calculation of various
												// SSNs
		LoanAmount loan = new LoanAmount();
		// LoanAmount will be the class where Jitendra takes the annual salary as input
		// and calculates loan amount based on criteria
		System.out.println("Calculated Loan Amount for Eligible candidates is" + loan.calculateLoanAmount());
		// sanctioned loan is printed

		double monthlyscore[][] = new double[8][12];
//here size 8 is for the SSN Provided by you in the chat and 12 is for months
		String s = "";
		for (int j = 0; j < 8; j++) {
			for (int i = 0; i < 12; i++) {
				String ssn[] = new String[8];
				ssn[i] = c.getSsnNumber();// array to store SSN id's using object of class Credit(Haripriya's class)
				monthlyscore[j][i] = c.getCreditScore();// storing the monthly Credit Score for a specific SSN
				System.out.println(ssn[i]);

				if (monthlyscore[j][i] >= 800 && monthlyscore[j][i] < 850) {
					s = "Exceptional";
					return s;
				} else if (c.getCreditScore() >= 740 && monthlyscore[j][i] <= 799) {
					s = "Very Good";
					return s;
				} else if (monthlyscore[j][i] > 670 && monthlyscore[j][i] < 739) {
					s = "Good";
					return s;
				} else if (monthlyscore[j][i] > 580 && monthlyscore[j][i] < 669) {
					s = "Fair";
					return s;
				} else if (monthlyscore[j][i] > 300 && monthlyscore[j][i] < 579) {
					s = "Poor";
					return s;// checking the criteria and returning the credit score
				}
			}
		}
		return s;

	}

}
