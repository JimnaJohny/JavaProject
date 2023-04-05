package javaWeek2Assignment;
import java.util.Scanner;
public class MultiplicationTable {
	int num;
	int product;
	Scanner sc = new Scanner(System.in);
	void table() {
		System.out.println("Enter the number");
		num=sc.nextInt();
		System.out.println("Multiplication table of "+num+" is:");
		for(int i=1;i<=10;i++)
		{
			product=num*i;
			System.out.println(num+"*"+i+"="+product);
		}
	}
	
	
}
