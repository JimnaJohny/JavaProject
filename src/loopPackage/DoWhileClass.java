package loopPackage;

public class DoWhileClass {
	int number;
	void consecutiveNumbers()
	{
		int finalNumber=number+9;
		do
		{
			System.out.println(number);
			number++;
		}while(number<=finalNumber);
	}
}
