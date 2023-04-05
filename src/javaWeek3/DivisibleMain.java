package javaWeek3;
import java.util.Arrays;
public class DivisibleMain {

	public static void main(String[] args) {
		DivisibleBy3And5 divisible = new DivisibleBy3And5();
		divisible.array();
		System.out.println(Arrays.toString(divisible.divisionArray));
	}

}
