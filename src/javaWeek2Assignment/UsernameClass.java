package javaWeek2Assignment;
import java.util.Scanner;
public class UsernameClass {
		String userId;
		String password;
		String savedUserId="pivotAdmin";
		String savedPassword="Admin123";
		Scanner sc = new Scanner(System.in);
	void checkUsername()
	{
		for(int counter=1;counter<=3;counter++)
		{
			System.out.println("Enter your UseId: ");
			userId = sc.next();
			System.out.println("Enter your Password: ");
			password = sc.next();
			if(userId.equals(savedUserId) && password.equals(savedPassword))
			//if(userId == "pivotAdmin" && password == "Admin123")
			{
				System.out.println("You are logged in to the application");
				break;
			}
			else
			{
				System.out.println("Incorrect User id or password");
				if(counter==3)
				System.out.println("Account locked");	
			}
		}
			
	}

}
