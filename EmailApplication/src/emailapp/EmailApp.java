package emailapp;

public class EmailApp {
	
	
	public static void main(String[] args) {
	Email email = new Email("Ramishka" , "Madhushan");
	//email.SetAlternateEmail("lw@gmail.com");
	//System.out.println(email.GetAlternateEmail());
	
	System.out.println(email.ShowInfo());

	}
}
