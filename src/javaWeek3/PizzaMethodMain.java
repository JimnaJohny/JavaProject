package javaWeek3;
import java.util.Scanner;
public class PizzaMethodMain {
	public static void main(String[] args) {
		String size;
		Scanner sc=new Scanner(System.in);
		System.out.println("Choose your Pizza size:");
		System.out.println("1. Small");
		System.out.println("2. Medium");
		System.out.println("3. Large");
		size=sc.nextLine();
		PizzaMethod order=new PizzaMethod();
		order.printBill(size);
		//String price = null;
		//System.out.println("Your final bill is $"+price);	
}

}
