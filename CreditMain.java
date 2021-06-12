package credit;

public class CreditMain {

	public static void main(String[] args) {
Credit c=new Credit("123255", 720, 1200000);
Credit c1=new Credit("123200", 760, 1500000);
CreditScore cs=new CreditScore();
System.out.println(cs.annualCreditScore(c));
System.out.println(cs.annualCreditScore(c1));
	}

}
