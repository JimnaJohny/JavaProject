package loopPackage;

public class LoopClass {
int number;
void printMultiplesOf2()
{
	int finalNumber=number*10;
	while(number<=finalNumber)
	{
		System.out.println(number);
		number+=2;
	}
}
}
