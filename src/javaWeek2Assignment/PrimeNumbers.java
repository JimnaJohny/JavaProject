package javaWeek2Assignment;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		 int num;
		 int flag=0;
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter a positive Integer: ");
		 num = sc.nextInt();
		  for(int i=2;i<=num/2;i++)
		 {
			 if(num%2==0)
				 flag=1;
			 break;
		 }
		 
		 if(flag==1)
			 System.out.println(num + " is not a prime number");
		 else if(num==1)
			 System.out.println("1 is neither prime nor composite");
		 else
			 System.out.println(num + " is a prime number");
	}

}
