package javaWeek2Assignment;
import java.util.Scanner;
public class CalculatorMain {

	public static void main(String[] args) {
		double num1;
		double num2;
		int operation;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number");
		num1=sc.nextInt();
		System.out.println("Enter the second number");
		num2=sc.nextInt();
		System.out.println("Choose your operation from the following:");
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		System.out.println("5. Square");
		System.out.println("6. Cube");
		operation=sc.nextInt();
		switch(operation) {
		case 1 : 
			System.out.println("Sum is: " + (num1+num2));
			break;
		case 2 : 
			System.out.println("Difference is: " + (num1-num2));
			break;
		case 3 : 
			System.out.println("Product is: " + (num1*num2));
			break;
		case 4 : 
			System.out.println("Quotient is: " + (num1/num2));
			break;
		case 5 : 
			System.out.println("Square of " + num1 + " is: " + (num1*num1));
			System.out.println("Square of " + num2 + " is: " + (num2*num2));
			break;
		case 6 : 
			System.out.println("Cube of " + num1 + " is: " + (num1*num1*num1));
			System.out.println("Cube of " + num2 + " is: " + (num2*num2*num2));
			break;
		default:
			System.out.println("Invalid Operation");
			break;
		}

	}

}
