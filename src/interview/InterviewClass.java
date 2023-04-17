package interview;

public class InterviewClass {
	int initial=10;
	void array()
	{
		int[] number= new int[10];
		for(int i=0;i<number.length;i++)
		{
			number[i]=initial;
			initial--;
			if(number[i]%2!=0)
			{
				number[i]=11;
			}
			System.out.println(number[i]);
		}
	}

}
