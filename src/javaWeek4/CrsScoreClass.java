package javaWeek4;

import java.util.Scanner;

public class CrsScoreClass {
	int i;
	int points;
	int years;
	Scanner sc = new Scanner(System.in);
	String[] educationType = { "PhD", "Master's Degree", "Two or more University Degrees",
			"12th+Three years or longer Degree/Diploma" };
	int[] educationPoints = { 25, 23, 22, 21 };
	int[] ages = { 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47 };
	int[] agesPoints = { 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };

	void educationPoints(String education) {
		for (i = 0; i < educationType.length; i++)
			if (educationType[i].equals(education)) {
				points = educationPoints[i];
			}
	}

	void experience() {
		System.out.println("Enter your experience in years: ");
		years = sc.nextInt();
		if (years == 4 || years == 5)
			points += 13;
		else if (years >= 6)
			points += 15;
	}

	void agePoints() {
		System.out.println("Enter your age in years: ");
		int age = sc.nextInt();
		if (age >= 18 && age <= 35)
			points += 12;
		else if (age > 36) {
			for (i = 0; i < ages.length; i++)
				if (ages[i] == age)
					points += agesPoints[i];
		} else
			System.out.println("Invalid Entry");
	}

	void ieltsPoints() {
		int score = 0;
		System.out.println("Enter your IELTS Score for Listening: ");
		double listening = sc.nextDouble();
		if (listening >= 8)
			score += 6;
		else if (listening == 7.5)
			score += 5;
		System.out.println("Enter your IELTS Score for Speaking: ");
		double speaking = sc.nextDouble();
		if (speaking >= 7)
			score += 6;
		else if (speaking == 6.5)
			score += 5;
		System.out.println("Enter your IELTS Score for Reading: ");
		double reading = sc.nextDouble();
		if (reading >= 7)
			score += 6;
		else if (listening == 6.5)
			score += 5;
		System.out.println("Enter your IELTS Score for Writing: ");
		double writing = sc.nextDouble();
		if (writing >= 7)
			score += 6;
		else if (listening == 6.5)
			score += 5;
		points = points + score;
	}

	void adaptability() {
		System.out.println("Do you have a relative in Canada? Y/N ");
		String relative = sc.next();
		if (relative == "Y")
			points += 5;
		System.out.println("Have you studied in Canada for atleast 2 years? Y/N ");
		String study = sc.next();
		if (study == "Y")
			points += 5;
		System.out.println("Have you worked in Canada for atleast 2 years at NOC O,A,B? Y/N ");
		String work = sc.next();
		if (work == "Y")
			points += 5;
		System.out.println("Total points you have scored: " + points + " points");
		if (points >= 67)
			System.out.println("You are qualified to submit an Expression of Interest(EOI) to Immigration Canada");
		else
			System.out.println("You are ineligible to submit EOI at this time");
	}
}
