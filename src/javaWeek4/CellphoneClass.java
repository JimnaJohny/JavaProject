package javaWeek4;

import java.util.Scanner;

public class CellphoneClass {
	String[] samsung = { "S22", "S22+", "S22 Ultra", "S22FE" };
	String[] apple = { "Iphone 14", "Iphone 14 pro", "Iphone 14 pro max", "Iphone 14 mini" };
	int[] phoneTabSamsung = { 25, 35, 55, 20 };
	int[] phoneTabApple = { 30, 40, 65, 25 };
	String[] plans = { "Rogers", "Bell", "Telus" };
	int[] planPrice = { 70, 80, 75 };
	int i;
	int price;
	String model;
	String modelName;
	int flag=0;
	Scanner sc = new Scanner(System.in);

	void samsungBrand() {
		System.out.println("Please enter the Samsung model that you want to buy from below: ");
		for (i = 0; i < samsung.length; i++) {
			System.out.println(samsung[i]);
		}
		model = sc.nextLine();
		for (i = 0; i < samsung.length; i++)
			if (samsung[i].equals(model)) {
				flag=1;
				modelName = samsung[i];
				price = phoneTabSamsung[i];
			}
			if(flag==0)
				System.out.println("Invalid Entry!");
	}

	void appleBrand() {
		System.out.println("Please enter the Apple model that you want to buy from below: ");
		for (i = 0; i < apple.length; i++) {
			System.out.println(apple[i]);
		}
		model = sc.nextLine();
		for (i = 0; i < apple.length; i++)
			if (apple[i].equals(model)) {
				flag=1;
				modelName = apple[i];
				price = phoneTabApple[i];
			}
			if(flag==0)
				System.out.println("Invalid Entry!");
	}

	void monthlyPlan(String plan) {
		System.out.println("You have selected " + modelName + " with " + plan + " plan");
		System.out.println("Your phone tab will be $" + price);
		for (i = 0; i < plans.length; i++)
			if (plans[i].equals(plan)) {
				System.out.println("Your monthly plan will be $" + planPrice[i]);
				int totalAmount = price + planPrice[i];
				System.out.println("Total monthly amount will be $" + totalAmount);
			}
	}
}
