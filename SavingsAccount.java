import java.util.*;

public class SavingsAccount extends CheckingAccount {
	protected double interestRate = 0.05d;

	public static void main(String[] args){
		SavingsAccount sa = new SavingsAccount();
		sa.start();
	}

	public void setInterestRate(double interestRate){
		this.interestRate = interestRate;
	}

	public void calcInterest(){
		double interest = this.balance * interestRate;
		setBalance(this.balance + interest);
		System.out.println("Your New Balance: + " + getBalanceString());
	}

	public double getInterestRate(){
		return this.interestRate;
	}
}
		
