package javaWeek4;

import java.util.Scanner;

public class CellphoneMainClass {
	public static void main(String[] args) {
		String os;
		String plan;
		int flag1 = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your preferred Operating System: Android / IOS");
		os = sc.nextLine();
		CellphoneClass cell = new CellphoneClass();
		if (os.equals("Android"))
			cell.samsungBrand();
		else if (os.equals("IOS"))
			cell.appleBrand();
		else {
			System.out.println("Invalid OS");
			flag1 = 1;
		}
		if (flag1 == 0) {
			System.out.println("Please select the plan that you want to opt for: Rogers/Telus/Bell");
			plan = sc.nextLine();
			cell.monthlyPlan(plan);
		}
	}

}
