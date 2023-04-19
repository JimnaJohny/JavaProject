package javaWeek4;

import java.util.Scanner;

public class CrsScoreMain {

	public static void main(String[] args) {
		String education;
		CrsScoreClass crs = new CrsScoreClass();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your education level: ");
		education = sc.nextLine();
		crs.educationPoints(education);
		crs.experience();
		crs.agePoints();
		crs.ieltsPoints();
		crs.adaptability();
	}
}
