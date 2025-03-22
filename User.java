import java.util.*;
import java.io*;

public abstract class User implements HasMenu {
	protected  String  userName();
	protected String PIN = " ";

	public static void main(String[] args){
	boolean login(){
		Scanner input = new Scanner(System.in);

		System.out.print("Please Enter Your Username");
		String username = input.nextLine();

		System.out.print("Please Enter Your 4 Digit Pin");
		String PIN = input.nextLine();

