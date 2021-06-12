package credit;

public class Credit {
String ssnNumber;
double creditScore,currentAnnualIncome;

public String getSsnNumber() {
	return ssnNumber;
}
public Credit(String ssnNumber, double creditScore, double currentAnnualIncome) {
	super();
	this.ssnNumber = ssnNumber;
	this.creditScore = creditScore;
	this.currentAnnualIncome = currentAnnualIncome;
}
public void setSsnNumber(String ssnNumber) {
	this.ssnNumber = ssnNumber;
}
public double getCreditScore() {
	return creditScore;
}
public void setCreditScore(double creditScore) {
	this.creditScore = creditScore;
}
public double getCurrentAnnualIncome() {
	return currentAnnualIncome;
}
public void setCurrentAnnualIncome(double currentAnnualIncome) {
	this.currentAnnualIncome = currentAnnualIncome;
}

}
