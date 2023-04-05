package javaWeek3;

public class DivisibleBy3And5 {
	int[] divisionArray = new int[10];
	int j=0;
void array()
{
	for(int num=1;num<=150;num++)
	{
		for (int i = j; i <= 9; i++)
		if(num%3==0 && num%5==0)
		{
			divisionArray[i]=num;
			j=i+1;
			break;
		}
	}
}
}
