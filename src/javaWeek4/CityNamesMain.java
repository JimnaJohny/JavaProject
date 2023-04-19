package javaWeek4;
import java.util.Scanner;
public class CityNamesMain {

	public static void main(String[] args) {
		String nameOfCity;
		CityNames city=new CityNames(); 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Name of the City: ");
		nameOfCity=sc.nextLine();
		city.searchCityName(nameOfCity);
		city.endingWithTon("ton");
		city.replaceWithFun("ton");
		String str="100 queen street,Toronto,M5V 3E3";
		city.extraction(str);
	}

}
