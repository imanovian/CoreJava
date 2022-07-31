package oops;

public class BOAbank extends Bank {

	public int CreditCardNum;
	public void CCBalance() {
		System.out.println("Inside CC balance");
		this.CreditCardNum = 1000;
		super.AccountNum = 123456;
		this.AccountNum =7890;
	}
	public void CloseAccount(int CCNumber) {
		System.out.println("Inside boa close account");
	}
}
