import java.util.*;

class Customer extends User{
	CheckingAccount checking = new CheckingAccount();
	SavingsAccount savings = new SavingsAccount();

	public static void main(String[] args){
		Customer customer = new Customer();
		customer.start();
	}

	public String menu(){

		Scanner input = new Scanner(System.in);
		System.out.println("0) Exit");
		System.out.println("1) Manage Checking Account");
		System.out.println("2) Manage Savings Account");
		System.out.println("3) Change PIN");
		System.out.println("Please pick 0, 1, 2 or 3");

		String userMenu = input.nextLine();
		
		return userMenu;
	}

	public void start(){
		boolean keepGoing = true;
		while (keepGoing){

			String userChoice = menu();

			if (userChoice.equals("0")){
				keepGoing = false;
			}

			else if (userChoice.equals("1")){
				System.out.println("Going to Checking Account...");
				this.checking.start();
			}

			else if (userChoice.equals("2")){
				System.out.println("Going to Savings Account...");
				this.savings.start();
			}

			else if (userChoice.equals("3")){
				System.out.println("Changing PIN! Got It!");
				this.changePIN();
			}
			
			else {
				System.out.println("NOT A VALID INPUT!");
			}
		}
	}

	public void changePIN(){
		Scanner input = new Scanner(System.in);
		System.out.println("Input new PIN: ");
		String newPIN = input.nextLine();
		this.PIN = newPIN;
	}
}
