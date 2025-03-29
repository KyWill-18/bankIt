import java.util.*;

public class Admin extends User implements HasMenu{

	public static void main(String[] args){
		Admin a = new Admin();
		a.login();
	}


	public Admin(){
		this.userName = "admin";
		this.PIN = "0000";
	}

	public String menu(){
		Scanner input = new Scanner(System.in);
		System.out.println("Admin Menu");
		System.out.println("0) Exit");
		System.out.println("1) Get Customer Report");
		System.out.println("2) Add A User");
		System.out.println("3) Add Interest");
		System.out.println("Please Choose 0, 1, 2, or 3");

		String result = input.nextLine();

		return result;
	}

	public void start(){

	}
}
