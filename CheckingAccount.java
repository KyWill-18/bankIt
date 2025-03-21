import java.util.*; 

public class CheckingAccount implements HasMenu{
	protected double balance; 


	public static void main(String[] args){
		CheckingAccount ca = new CheckingAccount();
		ca.start();
	}

	public CheckingAccount(){
		this.balance = 0d;
	}

	public CheckingAccount(double balance){
		this.balance = balance;
	}

	public String menu(){
		System.out.println("Welcome to your Checking Account!");
		System.out.println(" ");
		System.out.println("0) Exit");
		System.out.println("1) Check Balance");
		System.out.println("2) Make a Deposit");
		System.out.println("3) Make a Withdrawal");
		System.out.println("Please pick 0, 1, 2, or 3");

		Scanner input = new Scanner(System.in);
		String userMenu = input.nextLine();
		return userMenu;
	}

	public void start(){
		boolean keepGoing = true;
		while(keepGoing){

			String userChoice = menu();

			if (userChoice.equals("0")){
				System.out.println("Have A Good Day! Goodbye!");
				keepGoing = false;
			}

			else if (userChoice.equals("1")){
				System.out.println("Please Hold Checking Balance...");
				checkBalance();
			}

			else if (userChoice.equals("2")){
				System.out.println("Making A Deposit! Got It!");
				makeDeposit();
			}

			else if (userChoice.equals("3")){
				System.out.println("Making A Withdrawal! Got It!");
				makeWithdrawal();
			}
			
			else {
				System.out.println("NOT A VALID INPUT!");
			}
		}
	}

	public double getBalance(){
		return balance;
	}

	public String getBalanceString(){
		String balString = String.format("$%.02f", this.balance);
		return balString;
	}

	public void setBalance(double balance){
		this.balance = balance;
	}

	public void checkBalance(){
		String bal = getBalanceString();
		System.out.println(bal);
	}

	private double getDouble(){
		Scanner input = new Scanner(System.in);
		String userMenu = input.nextLine();

		try {
			double tempBalance = Double.parseDouble(userMenu);
			return tempBalance;
		} catch (Exception e) {
			System.out.print("INVALID INPUT");
		}

		return 0d;
	}

	public void makeDeposit(){
		System.out.println("How much would you like to deposit?");
		double deposit = getDouble();
		this.balance += deposit;
		String newBal = getBalanceString();
		System.out.println("Ok! Your new balance is " + newBal);
	}

	public void makeWithdrawal(){
		System.out.println("How much would you like to withdrawal?");
		double withdrawal = getDouble();
		
		this.balance -= withdrawal;
		
		String newBal = getBalanceString();
		System.out.println("Ok! Your new balance is " + newBal);
	}
}
