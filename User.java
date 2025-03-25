import java.util.*;

public abstract class User implements HasMenu {
	protected  String  userName;
	protected String PIN;

	public boolean login(){
		Scanner input = new Scanner(System.in);
		System.out.println("Username: ");
		userName = input.nextLine();
		System.out.println("PIN: ");
		PIN = input.nextLine();
		return true;
	}

	public boolean login(String userName, String  PIN){
		if (userName.equals(this.userName)){
			if(PIN.equals(this.PIN)){
				System.out.println("Login Successful");
				return true;
			}
		}
		return false;
	}

	public void setUserName(String userName){
		this.userName = userName;
	}

	public String getUserName(){
		return this.userName;
	}

	public void setPIN(String PIN){
		this.PIN = PIN;
	}

	public String getPIN(){
		return this.PIN;
	}

}



