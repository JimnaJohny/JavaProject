package loopPackage;
import java.util.Scanner;
public class ForLoopClass {
	double accountBalance;
	double overdraftAmount;
	int withdrawAmount;
	int actualPin;
	int enteredPin;
	Scanner sc = new Scanner(System.in);
void atmWithdraw()
{
	for(int counter=1;counter<=3;counter++)
	{
		System.out.println("Enter your PIN: ");
		enteredPin = sc.nextInt();
		if(actualPin == enteredPin)
		{
			System.out.println("Enter the amount you want to withdraw: ");
			withdrawAmount = sc.nextInt();
			if(accountBalance>=withdrawAmount || overdraftAmount>=withdrawAmount)
			{
				System.out.println("Wait while transaction is being processed");
				System.out.println("Your transaction is complete, Please take the cash and receipt");
			}else
			{
				System.out.println("Cannot complete transaction, not enough balance");
			}break;
		}else
		{
			System.out.println("Invalid PIN");
			if(counter==3)
			System.out.println("Card is blocked");	
		}
	}
		
}

}
