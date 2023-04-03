package javaWeek2Assignment;
import java.util.Scanner;
public class CalculatorMain {

	public static void main(String[] args) {
		int num;
		int operation;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		num=sc.nextInt();
		System.out.println("Choose your operation from the following:");
		System.out.println("1. Square");
		System.out.println("2. Cube");
		operation=sc.nextInt();
		switch(operation) {
		case 1 : 
			System.out.println("Square of " + num + " is: " + (num*num));
			break;
		case 2 : 
			System.out.println("Cube of " + num + " is: " + (num*num*num));
			break;
		default:
			System.out.println("Invalid Operation");
			break;
		}

	}

}
