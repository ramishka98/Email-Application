package emailapp;

import java.util.Scanner;

public class Email {
	private String FirstName;
	private String LastName;
	private String Password;
	private String Department;
	private String Email;
	private int MailBoxCapacity = 100;
	private String AlternateEmail;
	private int DefaultPasswordLength = 10;
	private String CompanySuffix = "ladieswin.com";
	
	// Constractor to receive the First Name and Last Name
	
	public Email(String FirstName , String LastName)
	{
		this.FirstName = FirstName;
		this.LastName = LastName;
		//System.out.println("Email Created : " + this.FirstName + " " + this.LastName);
		
		// call amethod asking for the department - return the department
		this.Department = setDepartment();
		//System.out.println("Department: "+ this.Department);
		
		//Call a method that return a random password
		this.Password = RandomPassword(DefaultPasswordLength);
		//System.out.println("Your Password is : "+ this.Password);
		
		//combine elements to generate email
		Email = FirstName.toLowerCase() + "." + LastName.toLowerCase() + "@" + Department.toLowerCase() + "." + CompanySuffix;
		//System.out.println("Your Email is: " + Email);
		
		
	}
	
	// Ask for the Department
	private String setDepartment() {
		System.out.println("New worker : " + FirstName + "Department Codes : \n1 for Sales \n2 for Development \n3 for Accounting \n0 for none \nEnter the Department Code : ");
		Scanner enter = new Scanner(System.in);
		int ChooseTheDepartment = enter.nextInt();
		if (ChooseTheDepartment == 1) 
		{
			return "Sales" ;
		}
		else if (ChooseTheDepartment == 2)
		{
			return "Development" ;
		}
		else if (ChooseTheDepartment == 3)
		{
			return "Accounting" ;
		}
		else
		{
			return "";
		}
		
	}
	
	
	// Generate a random Password
	private String RandomPassword(int length) {
		String PasswordSet = "ABCDEFGHIJKLMNOPQRSTUWXYZ0123456789!@#$%";
		char[] Password = new char[length];
		for (int i=0;i<length; i++)
		{
				int Random = (int) (Math.random() * PasswordSet.length());
				Password[i] = PasswordSet.charAt(Random);
		}
		return new String(Password);
	}
			
	
	
	// Set the mailbox capacity
	public void SetMailBoxCapacity (int capacity) {
		this.MailBoxCapacity = capacity;
		
	}
	
	
	// Set the alternate email
	public void SetAlternateEmail(String AltEmail) {
		this.AlternateEmail = AltEmail;
	}
	
	// Change the password
	public void ChangePassword(String password) {
		this.Password = password;
	}
	
	public int GetMailBoxCapacity() {
		return MailBoxCapacity;
		
	}
	public String GetAlternateEmail() {
		return AlternateEmail;
	}
	public String GetPassword() {
		return Password;
	}
	public String ShowInfo() {
		return "Display Name : " + FirstName + LastName + "\nCompany Email : " + Email + "\nMailBox Capacity : " + MailBoxCapacity + "mb"; 
	}
}
