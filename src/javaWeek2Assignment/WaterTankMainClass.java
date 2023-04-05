package javaWeek2Assignment;

public class WaterTankMainClass {

	public static void main(String[] args){
	int totalVolume=0;
	for(int initialVolume=20;initialVolume<=100;initialVolume++)
	{
		totalVolume=initialVolume*10;
		System.out.println("Watertank contains "+totalVolume+" litres of water");
	}
	System.out.println("Tank is reached to its maximum capacity of " + totalVolume + " litres");
	
	}

}
